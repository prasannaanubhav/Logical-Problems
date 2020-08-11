
public class GCD {

	public static int getGreatestCommonDivisor(int num1, int num2) {

		int num1GCD = 0;
		int num2GCD = 0;
		int gcd = 0;

		if (num1 < 10 || num2 < 10) {
			return -1;
		}

		for (int i = 1; (i <= num1) || (i <= num2); i++) {
			if (num1 % i == 0) {
				num1GCD = i;
			}
			if (num2 % i == 0) {
				num2GCD = i;
			}

			if (num1GCD == num2GCD) {
				gcd = num2GCD;
			}
		}

		return gcd;

	}

	public static void main(String[] args) {

		int returnValue = getGreatestCommonDivisor(81,153);
		System.out.println(returnValue);

	}

}
