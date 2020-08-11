import java.util.Scanner;

public class NumberToWords {

	public static void numberToWords(int number) {

		if (number < 10) {
			switchStatement(number);
		}

		if (number < 0) {
			System.out.println("Invalid Value");
		}

		else {

			int rem = 0;
			int length = 0;
			int num1 = reverse(number);
			int forLengthPurpose = num1;
			int countedDigit2 = digitCount(number);

			while (num1 > 0) {

				rem = num1 % 10;
				switchStatement(rem);
				num1 = num1 / 10;
			}

			String s1 = Integer.toString(forLengthPurpose);

			if (s1.length() < countedDigit2) {
				length = countedDigit2 - s1.length();

				int i = 0;
				while (i < length) {
					System.out.print("Zero ");
					i++;
				}
			}

		}
	}

	public static int digitCount(int number) {

		int count = 0;
		while (number > 0) {
			int rem = number % 10;
			number = number / 10;
			count++;
		}
		return count;
	}

	public static int reverse(int number) {
		int rem = 0;
		int rev = 0;

		while (number > 0) {
			rem = number % 10;
			rev = rev * 10 + rem;
			number = number / 10;
		}

		return rev;
	}

	public static void switchStatement(int rem) {

		switch (rem) {

		case 0:
			System.out.print("Zero ");
			break;

		case 1:
			System.out.print("One ");
			break;

		case 2:
			System.out.print("Two ");
			break;

		case 3:
			System.out.print("Three ");
			break;

		case 4:
			System.out.print("Four ");
			break;

		case 5:
			System.out.print("Five ");
			break;

		case 6:
			System.out.print("Six ");
			break;

		case 7:
			System.out.print("Seven ");
			break;

		case 8:
			System.out.print("Eight ");
			break;

		case 9:
			System.out.print("Nine ");
			break;

		}

	}

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		int number = Integer.parseInt(s1);
		String s2 = Integer.toString(number);
		if (s1.length() != s2.length()) {
			int length = s1.length() - s2.length();
			int i = 0;
			while (i < length) {
				System.out.print("Zero ");
				i++;
			}
		}
		numberToWords(number);
	}

}
