
public class ReverseArray {

	public static void main(String[] args) {

		Integer arr[] = { 12, 16, 9, 66, 64, 55, 77, 32 };

		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[(arr.length - 1) - i];
			arr[(arr.length - 1) - i] = temp;

		}

		for (Integer integer : arr) {
			System.out.print(integer);
			System.out.print(" ");
		}

	}

}
