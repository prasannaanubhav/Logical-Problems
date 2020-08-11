
public class SortingStrings {

	public static void main(String[] args) {
		
		String s1 ="Darwin";
		String s2 = "Brisbane";
		int comp = s1.compareTo(s2);
		System.out.println(comp);

		String value = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney ";
//		String value = "Brisbane Adelaide";
		String splitValue[] = value.split(" ");
		String finalValue[] = new String[splitValue.length];

		for (int i = 0; i < splitValue.length; i++) {
			for (int j = i+1; j < splitValue.length; j++) {

				if (splitValue[i].compareTo(splitValue[j]) < 0) {
					String temp = splitValue[i];
					splitValue[i] = splitValue[j];
					splitValue[j] = temp;
				}

			}
		}
		for (String string : splitValue) {
			System.out.println(string);
		}

	}

}
