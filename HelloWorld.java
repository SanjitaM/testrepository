/**
 * Hello world!
 *
 */
public class HelloWorld {
	public static void main(String[] args) {
		int returnvalue = 0;

		returnvalue = add(14, 79);

		System.out.println("Hello World!" + returnvalue);

	}

	public static int add(int a, int b) {
		return a + b;
	}
}
