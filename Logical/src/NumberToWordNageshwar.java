
import java.util.ArrayList;
import java.util.Scanner;

public class NumberToWordNageshwar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] num = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
		String[] word = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eigth", "nine" };
		System.out.println("enter any number");
		String number = sc.next();
		String[] numtoword = number.split("");
		ArrayList<Integer> alist = new ArrayList<Integer>();
		for (int i = 0; i < numtoword.length; i++) {
			for (int j = 0; j < num.length; j++) {
				if (numtoword[i].equals(num[j])) {
					alist.add(j);
				}
			}
		}
		String res = "";
		for (int i = 0; i < alist.size(); i++) {
			res += word[alist.get(i)] + " ";
		}
		System.out.println(res);

	}

}
