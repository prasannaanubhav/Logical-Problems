
public class WasteClass {

	public static void main(String[] args) {

		String s = "abcdefghijkl";
		String s1 = "efg";

		String arr[] = s.split("");
		String arr2[] = s1.split("");

		for (int i = 0; i < arr.length;) {
			for (int j = 0; j < arr2.length;) {
				if (arr[i].equals(arr2[j])) {
					System.out.println("substring is present");
					j++;
					if (j == arr2.length) {
						break;
					}
					i = 0;
				} else {
					System.out.println("substring is not present");
					i++;

				}
			}

		}
	}

}
