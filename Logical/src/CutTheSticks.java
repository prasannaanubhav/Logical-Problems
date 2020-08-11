
import java.util.ArrayList;
import java.util.Collections;

public class CutTheSticks {

	public ArrayList<Integer> getSticks(ArrayList arrlst, int sticks, int cutno) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < arrlst.size(); i++) {
			int x = (int) arrlst.get(i);
			list.add(x - cutno);
		}
		return list;
	}

	public ArrayList<Integer> getNewSticks(ArrayList arrlst) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < arrlst.size(); i++) {
			if ((int) arrlst.get(i) != 0) {
				list.add((int) arrlst.get(i));
			}
		}
		return list;
	}

	public ArrayList<Integer> getSortedList(ArrayList arrlst) {

		Collections.sort(arrlst);
		return arrlst;
	}

	public int getListSize(ArrayList arrlst) {
		int a = arrlst.size();
		return a;
	}

	public ArrayList getArraytoArrayList(int arr[]) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {

			list.add(arr[i]);
		}
		return list;
	}

	public static void main(String[] args) {

		int sticks = 6;
		int arr[] = {5,4,4,2,2,8};
		int cutno = 0;
		ArrayList newList = new ArrayList<>();
		ArrayList sortedList = null;
		ArrayList cutList = null;
		CutTheSticks cut = new CutTheSticks();

		ArrayList arrayList = cut.getArraytoArrayList(arr);
		System.out.println(cut.getListSize(arrayList));
		int listSize = cut.getListSize(arrayList);

		ArrayList arrayList2 = cut.getArraytoArrayList(arr);
		sortedList = cut.getSortedList(arrayList2);
		cutno = (int) arrayList2.get(0);

		cutList = cut.getSticks(sortedList, sticks, cutno);
		newList = cut.getNewSticks(cutList);
		listSize = cut.getListSize(newList);
		//System.out.println(newList);
		System.out.println(listSize);

		for (int i = listSize; i > 0;) {

			sortedList = cut.getSortedList(newList);
			cutno = (int) sortedList.get(0);
			cutList = cut.getSticks(sortedList, sticks, cutno);
			newList = cut.getNewSticks(cutList);
			listSize = cut.getListSize(newList);
			//System.out.println(newList);

			if (listSize == 0) {
				break;
			} else {
				System.out.println(listSize);
			}
		}

//		System.out.println(cutList);

	}

}
