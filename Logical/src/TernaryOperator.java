
public class TernaryOperator {
	public static void main(String[] args) {

		
		
		double first = 20.00d;
		double second = 80.00d;
		double total = (first + second) * 100;
		System.out.println("total=" + total);
		double remainder = total % 40;
		System.out.println("remainder=" + remainder);
		boolean value = (remainder == 0 )? true : false;
		if(!value) {
			System.out.println("oops got some remainder ="+remainder);
		}
			
	}

}
