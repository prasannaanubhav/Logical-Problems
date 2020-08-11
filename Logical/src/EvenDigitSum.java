
public class EvenDigitSum {

	public static int getEvenDigitSum(int number) {

		if(number<0) {
			return -1;
		}
		String num = Integer.toString(number);
		int sum = 0;
		int arr[] = new int[num.length()];
		for (int i = 0; i < num.length(); i++) {

			arr[i] = num.charAt(i) - '0';
			if(arr[i]%2==0) {
				sum =sum+arr[i];
			}
		}
		return sum;

	}

	public static void main(String[] args) {
		
		int value = getEvenDigitSum(-123456789);
		System.out.println(value);

	}

}
