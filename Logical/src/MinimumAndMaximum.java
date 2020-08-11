import java.util.Scanner;

public class MinimumAndMaximum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the how much number you want to enter:");
		int muchNumber = sc.nextInt();
		sc.nextLine();
		int i = 0;
		int order = 1;
		int min = 0;
		int max = 0;
		boolean first = true;
		while (i < muchNumber) {
			System.out.println("enter the "+order+" number ");
			int number = sc.nextInt();
			if (number < 0) {
				System.out.println("Invalid input");
				continue;
			}

			if (first) {
				first = false;
				min = number;
				max = number;
			}
			if (number > max) {
				max = number;
			}
			if (number < min) {
				min = number;
			}
			order++;
			i++;
		}
		System.out.println("Minimun number is = " + min);
		System.out.println("Maximum number is = " + max);

	}

}
