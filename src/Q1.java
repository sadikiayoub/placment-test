
public class Q1 {

	static boolean isPlandrome(String str) {
		for (int i = 0; i < (str.length()) / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - i - 1))
				return false;
		}
		return true;
	}

	static boolean isPlandrome(int number) {
		return isPlandrome(String.valueOf(number));
	}

	public static void main(String[] args) {
		System.out.println(isPlandrome(123321));
		System.out.println(isPlandrome(1233321));
		System.out.println(isPlandrome(123421));
		System.out.println(isPlandrome(1));
	}
}
