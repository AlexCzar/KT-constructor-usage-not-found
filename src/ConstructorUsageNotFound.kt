class A(val value: String) {
	/**
	 * This constructor is marked as unused even though it is used in Main.java by reference
	 */
	constructor(b: B) : this(b.value)

}

class B(val value: String)

fun `try to use in Kotlin`() {
	// uncomment the following line to see that usage by reference in Kotlin is detected, the warning will go away.
	//listOf(B("b")).map(::A)
}