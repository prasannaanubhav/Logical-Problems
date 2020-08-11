import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ForHandsOnPractice {

	public static void printList(List<Integer> list) {
		for (Integer integer : list) {
			System.out.print(integer + " ");
		}
	}

	static final Comparator<Integer> compare = new Comparator<Integer>() {

		@Override
		public int compare(Integer i1, Integer i2) {
			if (i1 < i2) {
				return 1;
			} else if (i1 > i2) {
				return -1;
			} else
				return 0;
		}
	};

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(23);
		list.add(11);
		list.add(84);
		list.add(23);
		list.add(845);
		list.add(64);
		list.add(93);
		list.add(192);
		int Minvalue = Collections.min(list);
		int MaxValue = Collections.max(list);
//		System.out.println(Minvalue);
//		System.out.println(MaxValue);
//		Collections.sort(list);
//		printList(list);
//		for (int i = 0; i < list.size(); i++) {
//			for (int j = i + 1; j < list.size(); j++) {
//				if (list.get(i).compareTo(list.get(j)) > 0) {
//					Collections.swap(list, i, j);
//
//				}
//			}
//		}
		int i = Collections.binarySearch(list, 64);
		Collections.sort(list, compare);
		
		System.out.println(i);
		printList(list);
		System.out.println();

	}

}
