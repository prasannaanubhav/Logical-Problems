
public class FirstAndLastDigitSum {

	public static int sumfirstAndLastDigit(int number) {

		if (number < 0) {
			return -1;
		} else if (number == 0) {
			return 0;
		} else if (number > 0) {
			int numb1 = 0 ;
			int numb2=0;
			String num = Integer.toString(number);
			int i=0;
				numb1	= num.charAt(i)-'0';
				numb2 = num.charAt(num.length()-1)-'0';		
//			System.out.println(numb1);
//			System.out.println(numb2);
			int add = numb1+numb2;
			return add;
		}
		return 0;
	}

	public static void main(String[] args) {
		
		int value = sumfirstAndLastDigit(5);
		System.out.println(value);

	}

}
