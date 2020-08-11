
public class ArraySorting {

	public static int[] getSortedArray(int arrays[]) {
		
		int arr[] = new int[arrays.length];
		int temp=0;
		
		for(int i =0;i<arrays.length;i++) {
			
			for(int j =i+1;j<arrays.length;j++) {
				if(arrays[i]>arrays[j]) {
					temp=arrays[i];
					arrays[i]=arrays[j];
					arrays[j]=temp;
				}
			}
			
		}
		for (int k : arrays) {
			System.out.println(k);
		}
		
		return null;
	}

	public static void main(String[] args) {

		int arr[] = { 21, 16, 106, 82, 43 };
		getSortedArray(arr);

	}

}
