
public class Q3 {
	static String reverseString(String string) {
		return new StringBuilder(string).reverse().toString();
	}

	public static void main(String[] args) {
		String string = "abcdefghijklmnopkrstuvwxyz";
		string = reverseString(string);
		System.out.println(string);
	}
}
