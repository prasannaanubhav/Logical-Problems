import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class SortingWithComperator implements Comparator<Integer>{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<>();
		for(int i=0; i<5;i++) {
			int a = sc.nextInt();
			list.add(a);
		}
		Collections.sort(list, new SortingWithComperator());
		System.out.println(list);
	}

	@Override
	public int compare(Integer o1, Integer o2) {

		if(o1<o2)
			return 1;
		
		if(o1>o2)
			return -1;
		else
		return 0;
	}

}
