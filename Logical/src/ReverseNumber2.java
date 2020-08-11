
public class ReverseNumber2 {
	
	public static boolean isPalindrome(int number){
	  int n= number;
		int rev =0;
	    while(number>0 || number<0){	
		int rem = number%10;
		rev = rev*10+rem;
		number = number/10;

	 }
	    System.out.println(rev);
	 if(rev==n)
	 return true;
	 else
	 return  false;
	}

	public static void main(String[] args) {
		boolean returnValue = isPalindrome(121);
		System.out.println(returnValue);

	}

}
