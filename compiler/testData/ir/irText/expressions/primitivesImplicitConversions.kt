// LANGUAGE: -ApproximateIntegerLiteralTypesInReceiverPosition
// IGNORE_BACKEND_K2: ANY
// For reasons this test is ignored, go to KT-46419

val test1: Long = 42
val test2: Short = 42
val test3: Byte = 42
val test4: Long = 42.unaryMinus()
val test5: Short = 42.unaryMinus()
val test6: Byte = 42.unaryMinus()

fun test() {
    val test1: Int? = 42
    val test2: Long = 42
    val test3: Long? = 42
    val test4: Long? = -1
    val test5: Long? = 1.unaryMinus()
    val test6: Short? = 1.unaryMinus()
    val test7: Byte? = 1.unaryMinus()
}

fun testImplicitArguments(x: Long = 1.unaryMinus()) {}

class TestImplicitArguments(val x: Long = 1.unaryMinus())
