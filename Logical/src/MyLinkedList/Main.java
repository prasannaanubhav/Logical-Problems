package MyLinkedList;

public class Main {

	public static void main(String[] args) {

		ServiceImpl serviceImpl = new ServiceImpl();
		String value = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney ";
//		String value = "Brisbane Adelaide";
		String splitValue[] = value.split(" ");
		String finalValue[] = new String[splitValue.length];

		for (int i = 0; i < splitValue.length; i++) {
			for (int j = 0; j < splitValue.length; j++) {

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
