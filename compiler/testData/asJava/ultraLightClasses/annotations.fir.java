@java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.RUNTIME)
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.CLASS, kotlin.annotation.AnnotationTarget.FUNCTION, kotlin.annotation.AnnotationTarget.VALUE_PARAMETER, kotlin.annotation.AnnotationTarget.EXPRESSION})
public abstract @interface Anno2 /* Anno2*/ {
}

@java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.RUNTIME)
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.CLASS, kotlin.annotation.AnnotationTarget.FUNCTION, kotlin.annotation.AnnotationTarget.VALUE_PARAMETER, kotlin.annotation.AnnotationTarget.EXPRESSION})
public abstract @interface Anno3 /* Anno3*/ {
}

@java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.RUNTIME)
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.CLASS, kotlin.annotation.AnnotationTarget.FUNCTION, kotlin.annotation.AnnotationTarget.VALUE_PARAMETER, kotlin.annotation.AnnotationTarget.EXPRESSION})
public abstract @interface Anno4 /* Anno4*/ {
}

@java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.RUNTIME)
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.CLASS, kotlin.annotation.AnnotationTarget.FUNCTION, kotlin.annotation.AnnotationTarget.VALUE_PARAMETER, kotlin.annotation.AnnotationTarget.EXPRESSION})
public abstract @interface Anno5 /* Anno5*/ {
}

@java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.RUNTIME)
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.CLASS, kotlin.annotation.AnnotationTarget.FUNCTION, kotlin.annotation.AnnotationTarget.VALUE_PARAMETER, kotlin.annotation.AnnotationTarget.EXPRESSION})
public abstract @interface Anno6 /* Anno6*/ {
}

@java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.RUNTIME)
public abstract @interface AnnoWithCompanion /* AnnoWithCompanion*/ {
  @org.jetbrains.annotations.NotNull()
  public static final AnnoWithCompanion.Companion Companion;


  class Companion ...

  }

public static final class Companion /* AnnoWithCompanion.Companion*/ {
  private  Companion();//  .ctor()

  public final void foo();//  foo()

}

@java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.RUNTIME)
public abstract @interface Anno /* Anno*/ {
  public abstract Anno[] x() default {Anno(p = "a"), Anno(p = "b")};//  x()

  public abstract java.lang.String p() default "";//  p()

}

@Deprecated(message = "This anno is deprecated, use === instead", replaceWith = @ReplaceWith(expression = "this === other"))
@java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.SOURCE)
@kotlin.annotation.MustBeDocumented()
@kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.SOURCE)
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.CLASS, kotlin.annotation.AnnotationTarget.FUNCTION, kotlin.annotation.AnnotationTarget.VALUE_PARAMETER, kotlin.annotation.AnnotationTarget.EXPRESSION})
public abstract @interface Fancy /* Fancy*/ {
}

@java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.RUNTIME)
public abstract @interface ReplaceWith /* ReplaceWith*/ {
  public abstract java.lang.String expression();//  expression()

}

@java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.RUNTIME)
public abstract @interface AnnotatedAttribute /* AnnotatedAttribute*/ {
  @Anno()
  public abstract java.lang.String x();//  x()

}

@java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.RUNTIME)
public abstract @interface Deprecated /* Deprecated*/ {
  public abstract ReplaceWith replaceWith() default @ReplaceWith(expression = "");//  replaceWith()

  public abstract java.lang.String message();//  message()

}

@java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.RUNTIME)
public abstract @interface Ann /* Ann*/ {
  public abstract java.lang.Class<? extends java.lang.Object> arg2();//  arg2()

  public abstract java.lang.Class<?> arg1();//  arg1()

}

@Anno()
public final class F /* F*/ implements java.lang.Runnable {
  @Anno(p = "p")
  @org.jetbrains.annotations.NotNull()
  private java.lang.String prop = "x" /* initializer type: java.lang.String */;

  @Anno(p = "f")
  public final void f(@Anno() @org.jetbrains.annotations.NotNull() java.lang.String);//  f(java.lang.String)

  @org.jetbrains.annotations.NotNull()
  public final java.lang.String getProp();//  getProp()

  public  F();//  .ctor()

  public final void setProp(@org.jetbrains.annotations.NotNull() java.lang.String);//  setProp(java.lang.String)

}

public final class Foo /* Foo*/ {
  @org.jetbrains.annotations.Nullable()
  private java.lang.String x = null /* initializer type: null */;

  @Anno()
  public  Foo(error.NonExistentClass);//  .ctor(error.NonExistentClass)

  @Anno()
  public final void f4(@org.jetbrains.annotations.NotNull() java.lang.String);//  f4(java.lang.String)

  @Anno()
  public final void setX(@org.jetbrains.annotations.Nullable() java.lang.String);//  setX(java.lang.String)

  @org.jetbrains.annotations.Nullable()
  public final java.lang.String getX();//  getX()

}

@Ann(arg1 = java.lang.String.class, arg2 = int.class)
public final class MyClass /* MyClass*/ {
  public  MyClass();//  .ctor()

}

public final class Example /* Example*/ {
  @Ann()
  @org.jetbrains.annotations.NotNull()
  private final java.lang.String foo;

  @org.jetbrains.annotations.NotNull()
  private final java.lang.String bar;

  @org.jetbrains.annotations.NotNull()
  private final java.lang.String quux;

  @Ann()
  @org.jetbrains.annotations.NotNull()
  public final java.lang.String getBar();//  getBar()

  @org.jetbrains.annotations.NotNull()
  public final java.lang.String getFoo();//  getFoo()

  @org.jetbrains.annotations.NotNull()
  public final java.lang.String getQuux();//  getQuux()

  public  Example(@org.jetbrains.annotations.NotNull() java.lang.String, @org.jetbrains.annotations.NotNull() java.lang.String, @Ann() @org.jetbrains.annotations.NotNull() java.lang.String);//  .ctor(java.lang.String, java.lang.String, java.lang.String)

}

public final class CtorAnnotations /* CtorAnnotations*/ {
  @Anno()
  @org.jetbrains.annotations.NotNull()
  private final java.lang.String x;

  @org.jetbrains.annotations.NotNull()
  private final java.lang.String y;

  @org.jetbrains.annotations.NotNull()
  private final java.lang.String z;

  @org.jetbrains.annotations.NotNull()
  public final java.lang.String getX();//  getX()

  @org.jetbrains.annotations.NotNull()
  public final java.lang.String getY();//  getY()

  @org.jetbrains.annotations.NotNull()
  public final java.lang.String getZ();//  getZ()

  public  CtorAnnotations(@Anno() @org.jetbrains.annotations.NotNull() java.lang.String, @Anno() @org.jetbrains.annotations.NotNull() java.lang.String, @org.jetbrains.annotations.NotNull() java.lang.String);//  .ctor(java.lang.String, java.lang.String, java.lang.String)

}
