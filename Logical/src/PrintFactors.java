
public class PrintFactors {

	public static void printFactors(int number) {

		if (number < 1)
			System.out.println("Invalid Value");
		int i = 1;
		while (number >= i) {
			if (number % i == 0) {
				System.out.println(i);
				i++;
			} 
			else
				i++;
		}
	}

	public static void main(String[] args) {
		printFactors(10);

	}

}
