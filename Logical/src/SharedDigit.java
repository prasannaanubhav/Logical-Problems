
public class SharedDigit {

	public static boolean hasSharedDigit(int num1, int num2) {

		String s1 = Integer.toString(num1);
		String s2 = Integer.toString(num2);

		if ((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)) {
			return false;
		}

		else if ((s1.charAt(0) - '0') == (s2.charAt(0) - '0')) {
			return true;
		} else if ((s1.charAt(0) - '0') == (s2.charAt(s1.length() - 1) - '0')) {
			return true;
		} else if ((s1.charAt(s1.length() - 1) - '0') == (s2.charAt(0) - '0')) {
			return true;
		} else if ((s1.charAt(s1.length() - 1) - '0') == (s2.charAt(s1.length() - 1) - '0')) {
			return true;
		}

		else
			return false;

	}

	public static void main(String[] args) {

		boolean value = hasSharedDigit(9, 99);
		System.out.println(value);
	}

}
