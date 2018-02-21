import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Stream.of(new B("b"))
				.map(A::new);
		// direct constructor call is also detected, uncomment the following code and check ConstructorUsageNotFound.kt
		// the warning will be gone
//		new A(new B("b"));
	}
}
