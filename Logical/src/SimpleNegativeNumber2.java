import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class SimpleNegativeNumber2 {

	public static List<List<String>> getValue() {

		List<List<String>> debts = new ArrayList<List<String>>();

//		List<String> value1 = new ArrayList<>();
//		value1.add("Alex");
//		value1.add("Blake");
//		value1.add("5");
//		debts.add(value1);
//
//		List<String> value2 = new ArrayList<>();
//		value2.add("Blake");
//		value2.add("Alex");
//		value2.add("3");
//		debts.add(value2);
//
//		List<String> value3 = new ArrayList<>();
//		value3.add("Caesy");
//		value3.add("Alex");
//		value3.add("7");
//		debts.add(value3);
		
		List<String> value1 = new ArrayList<>();
		value1.add("Alex");
		value1.add("Blake");
		value1.add("2");
		debts.add(value1);

		List<String> value2 = new ArrayList<>();
		value2.add("Blake");
		value2.add("Alex");
		value2.add("2");
		debts.add(value2);

		List<String> value3 = new ArrayList<>();
		value3.add("Caesy");
		value3.add("Alex");
		value3.add("5");
		debts.add(value3);
		
//
//		List<String> valueVV = new ArrayList<>();
//		valueVV.add("Caesy");
//		valueVV.add("Alex");
//		valueVV.add("4");
//		debts.add(valueVV);
//
//		List<String> valueVB = new ArrayList<>();
//		valueVB.add("Caesy");
//		valueVB.add("Alex");
//		valueVB.add("2");
//		debts.add(valueVB);
//
//		return debts;

		List<String> value4 = new ArrayList<>();
		value4.add("Blake");
		value4.add("Caesy");
		value4.add("7");
		debts.add(value4);

		List<String> value5 = new ArrayList<>();
		value5.add("Alex");
		value5.add("Blake");
		value5.add("4");
		debts.add(value5);

		List<String> value6 = new ArrayList<>();
		value6.add("Alex");
		value6.add("Caesy");
		value6.add("4");
		debts.add(value6);
		return debts;
		
//		List<String> value7 = new ArrayList<>();
//		value7.add("Tussan");
//		value7.add("Shanti");
//		value7.add("-9");
//		debts.add(value7);
		
	}

	public static List<String> getLendAmount(List<List<String>> value, int index) {

		int Lamount = 0;
		String name = null;
		for (int j = 0; j < value.size(); j++) {

			name = value.get(index).get(1);
			if (name.equals(value.get(j).get(1))) {
				String borrowAmount = value.get(j).get(2);
				Lamount = Integer.parseInt(borrowAmount) + Lamount;

			}
		}
		LinkedHashSet<String> set = new LinkedHashSet();
		set.add(name);
		set.add(String.valueOf(Lamount));
//			 System.out.println(set);
		List<String> list = new ArrayList<String>(set);
		return list;

	}

	public static List<String> getBorrwoAmount(List<List<String>> value, int index) {

		int Bamount = 0;
		String name = null;

		for (int j = 0; j < value.size(); j++) {

			name = value.get(index).get(0);
			if (name.equals(value.get(j).get(0))) {

				String borrowAmount = value.get(j).get(2);
				Bamount = Integer.parseInt(borrowAmount) + Bamount;

			}

		}

		LinkedHashSet<String> set = new LinkedHashSet();
		set.add(name);
		set.add(String.valueOf(Bamount));
//			 System.out.println(set);
		List<String> list = new ArrayList<String>(set);
		return list;

	}

	public static void main(String[] args) {

		int debt = 0;
		int borrow;
		int lend;
		List<List<String>> borrowAmount = new ArrayList<>();
		List<List<String>> value = getValue();
		TreeSet<String> set = new TreeSet<String>();
		List<String> borrowAmountValue = null;
		for (int i = 0; i < value.size();) {
			borrowAmountValue = getBorrwoAmount(value, i);
//			set.add(borrowAmount.get(1));
			if (!set.contains(borrowAmountValue.get(0))) {
				set.add(borrowAmountValue.get(0));
				i++;
				borrowAmount.add(borrowAmountValue);
//				System.out.println(borrowAmount);
			} else
				break;
		}
//		System.out.println(borrowAmount);

//		System.out.println("***************************************");
		List<List<String>> value1 = getValue();
		List<List<String>> lendAmount = new ArrayList<>();
		TreeSet<String> set1 = new TreeSet<String>();
		List<String> lendAmountValue = null;
		for (int i = 0; i < value.size();) {
			lendAmountValue = getLendAmount(value1, i);
//			set.add(borrowAmount.get(1));
			if (!set1.contains(lendAmountValue.get(0))) {
				set1.add(lendAmountValue.get(0));
				i++;
				lendAmount.add(lendAmountValue);

//				System.out.println(lendAmount);
			} else
				i++;
		}
//		System.out.println(lendAmount);
		List<Integer> lst = new ArrayList<>();

		List<String> set1Value = new ArrayList<>(set1);
		List<String> setValue = new ArrayList<>(set);

		List<String> addingValue = new ArrayList<>();

		if (set1Value.size() != setValue.size()) {

			if (set1Value.size() < setValue.size()) {

				for (int i = 0; i < setValue.size(); i++) {
					try {
					if (!setValue.contains(set1Value.get(i))) {
						addingValue.add(setValue.get(i));
					}
					}catch (IndexOutOfBoundsException e) {
						addingValue.add(setValue.get(i));
					}

				}

			} else
				for (int i = 0; i < set1.size(); i++) {
					try {
					if (!set1Value.contains(setValue.get(i))) {
						addingValue.add(set1Value.get(i));
					}
					}catch (IndexOutOfBoundsException e) {
						addingValue.add(set1Value.get(i));
					}
				}

		}

		addingValue.add("0");

		if (borrowAmount.size() != lendAmount.size()) {
			if (lendAmount.size() < borrowAmount.size()) {
				int sizeDifference = borrowAmount.size() - lendAmount.size();
				for (int i = 0; i < sizeDifference; i++) {
					lendAmount.add(lendAmount.size() + i, addingValue);
				}

			} else {
				int sizeDifference = lendAmount.size() - borrowAmount.size();
				for (int i = 0; i < sizeDifference; i++) {
					borrowAmount.add(borrowAmount.size() + i, addingValue);
				}
			}
		}

		for (int i = 0; i < lendAmount.size(); i++) {

			for (int j = 0; j < lendAmount.size(); j++) {

				if (borrowAmount.get(i).get(0).equals(lendAmount.get(j).get(0))) {
					lend = Integer.parseInt(lendAmount.get(j).get(1));
					borrow = Integer.parseInt(borrowAmount.get(i).get(1));
					debt = lend - borrow;
//					System.out.println(debt);

					lst.add(debt);
//					Collections.sort(lst);

				}

			}
		}
		System.out.println(lst);
		TreeSet<String> tree = new TreeSet<String>();
		for (int i = 0; i < lst.size() - 1; i++) {

			if (lst.get(i) == lst.get(i + 1)) {
				tree.add(borrowAmount.get(i).get(0));
				tree.add(borrowAmount.get(i + 1).get(0));
				break;
			} else if (lst.get(i + 1) == lst.get(lst.size() - 1)) {
				tree.add(borrowAmount.get(i + 1).get(0));
				tree.add(borrowAmount.get(lst.size() - 1).get(0));
				break;
			}

			else if (lst.get(i) == lst.get(i + 1) && lst.get(i + 1) == lst.get(lst.size() - 1)) {
				tree.add(borrowAmount.get(i).get(0));
				tree.add(borrowAmount.get(i + 1).get(0));
				tree.add(borrowAmount.get(lst.size() - 1).get(0));
				break;
			} else if (lst.get(i) < lst.get(i + 1) && lst.get(i) < lst.get(lst.size() - 1)) {
				tree.add(borrowAmount.get(i).get(0));
				break;
			} else if (lst.get(i + 1) < lst.get(i) && lst.get(i + 1) < lst.get(lst.size() - 1)) {
				tree.add(borrowAmount.get(i + 1).get(0));
				break;
			} else
				tree.add(borrowAmount.get(lst.size() - 1).get(0));

		}
		System.out.println(tree);
	}

}
