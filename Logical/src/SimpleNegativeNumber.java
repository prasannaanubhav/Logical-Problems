import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class SimpleNegativeNumber {

	public static List<List<String>> getValue() {

		List<List<String>> debts = new ArrayList<List<String>>();

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

	}

	public static int getBorrwoAmount(List<List<String>> value, String borrowerName) {

		int Bamount = 0;
		for (int i = 0; i < value.size(); i++) {

			String name = value.get(i).get(1);
			if (name.equals(borrowerName)) {

				String borrowAmount = value.get(i).get(2);
				Bamount = Integer.parseInt(borrowAmount) + Bamount;

			}
		}
		return Bamount;

	}

	public static int getLendAmount(List<List<String>> value, String lendersName) {

		int Lamount = 0;
		for (int i = 0; i < value.size(); i++) {

			String name = value.get(i).get(0);
			if (name.equals(lendersName)) {

				String borrowAmount = value.get(i).get(2);
				Lamount = Integer.parseInt(borrowAmount) + Lamount;

			}
		}
		return Lamount;

	}

	public static void main(String[] args) {
		List<List<String>> value = getValue();
		int AlexBamount = getBorrwoAmount(value, "Alex");
		int AlexLamount = getLendAmount(value, "Alex");

		int BlakeBamount = getBorrwoAmount(value, "Blake");
		int BlakeLamount = getLendAmount(value, "Blake");

		int CaesyBamount = getBorrwoAmount(value, "Caesy");
		int CaesyLamount = getLendAmount(value, "Caesy");

		int Alexdebt = AlexBamount - AlexLamount;
		System.out.println(Alexdebt);
		int Blakedebt = BlakeBamount - BlakeLamount;
		System.out.println(Blakedebt);
		int Caesydebt = CaesyBamount - CaesyLamount;
		System.out.println(Caesydebt);
		
		 TreeSet<String> tree=new TreeSet<String>();   
		 
		if(Alexdebt==Blakedebt) {
			tree.add("Alex");
			tree.add("Blake");
		}
		else if(Blakedebt==Caesydebt) {
			tree.add("Blake");
			tree.add("Caesy");
		}
		else if(Alexdebt==Blakedebt && Blakedebt== Caesydebt) {
			tree.add("Alex");
			tree.add("Blake");
			tree.add("Caesy");
		}
		else if(Alexdebt<Blakedebt && Alexdebt<Caesydebt) {
			tree.add("Alex");
		}
		else if(Blakedebt<Alexdebt && Blakedebt<Caesydebt) {
			tree.add("Blake");
		}
		else
			tree.add("Caesy");
				
		System.out.println(tree);

	}

}
