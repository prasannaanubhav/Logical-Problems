
public class ReverseNumber {

	public static void main(String[] args) {

		int number = 331;
		int n =number;
		boolean value = false;
		String num = "";
		while (number > 0) {
			int rem = number % 10;
			number = number / 10;
			num = num + String.valueOf(rem);
			if (number==0) {
				break;
			}
		}
		if(num.equals(String.valueOf(n)))
			value = true;
		System.out.println(num);
		System.out.println(value);
	}
}
