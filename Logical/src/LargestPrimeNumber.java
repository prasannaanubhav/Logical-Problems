
public class LargestPrimeNumber {


	public static int getLargestprime(int number) {
		
		if(number<=0) {
			return -1;
		}
		
		int primeValue=0;
	for(int i=2 ; i<number/2;i++) {
		if(number%i==0) {
			boolean value = isPrime(i);
			if(value) {
				primeValue = i;
			
			}
		}
	}
	return primeValue;
		
	}
	
	public static boolean isPrime(int number) {
		
		int flag=0;
		for(int i=2;i<number/2;i++) {
			if(number%i==0) {
				flag=1;
				break;
			}
		}
		if(flag==1)
		return false;
		
		return true;
	}

	public static void main(String[] args) {

		int value = getLargestprime(217);
		System.out.println(value);
	}

}
