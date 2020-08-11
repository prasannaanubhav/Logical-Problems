
public class LeapYear {

	public static boolean isLeapYear(int year) {

		if (year <= 0) {
			return false;
		}

		if (year >= 1 && year <= 9999) {

			int rem1 = year % 4;
			int rem2 = year % 100;
			int rem3 = year % 400;
			
			if(rem1==0) {
				if(rem2==0) {
					if(rem3==0)
						return true;
					else 
						return false;
				}
				else 
					return true;
			}

		}
		return false;
		
		
	}



	public static void main(String[] args) {
		boolean result = isLeapYear(1924);
		System.out.println(result);
	}
}
