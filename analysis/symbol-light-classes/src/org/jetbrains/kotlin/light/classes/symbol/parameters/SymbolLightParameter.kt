/*
 * Copyright 2010-2022 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.light.classes.symbol.parameters

import com.intellij.psi.PsiAnnotation
import com.intellij.psi.PsiModifierList
import org.jetbrains.kotlin.analysis.api.KtAnalysisSession
import org.jetbrains.kotlin.analysis.api.lifetime.isValid
import org.jetbrains.kotlin.analysis.api.symbols.KtValueParameterSymbol
import org.jetbrains.kotlin.asJava.classes.lazyPub
import org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget
import org.jetbrains.kotlin.light.classes.symbol.NullabilityType
import org.jetbrains.kotlin.light.classes.symbol.annotations.computeAnnotations
import org.jetbrains.kotlin.light.classes.symbol.methods.SymbolLightMethodBase
import org.jetbrains.kotlin.light.classes.symbol.modifierLists.SymbolLightClassModifierList
import org.jetbrains.kotlin.utils.addToStdlib.ifTrue

context(KtAnalysisSession)
internal class SymbolLightParameter(
    private val parameterSymbol: KtValueParameterSymbol,
    containingMethod: SymbolLightMethodBase
) : SymbolLightParameterCommon(parameterSymbol, containingMethod) {

    private val isConstructorParameterSymbol = containingMethod.isConstructor

    private val _annotations: List<PsiAnnotation> by lazyPub {

        val annotationSite = isConstructorParameterSymbol.ifTrue {
            AnnotationUseSiteTarget.CONSTRUCTOR_PARAMETER
        }

        val nullability = if (parameterSymbol.isVararg) NullabilityType.NotNull else super.nullabilityType

        parameterSymbol.computeAnnotations(
            parent = this,
            nullability = nullability,
            annotationUseSiteTarget = annotationSite,
            includeAnnotationsWithoutSite = true
        )
    }

    override fun getModifierList(): PsiModifierList = _modifierList
    private val _modifierList: PsiModifierList by lazyPub {
        SymbolLightClassModifierList(this, lazyOf(emptySet()), lazyOf(_annotations))
    }

    override fun isVarArgs() = parameterSymbol.isVararg

    override fun equals(other: Any?): Boolean =
        this === other ||
                (other is SymbolLightParameter && parameterSymbol == other.parameterSymbol)

    override fun hashCode(): Int = kotlinOrigin.hashCode()

    override fun isValid(): Boolean = super.isValid() && parameterSymbol.isValid()
}