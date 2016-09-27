package arraySorts;


public class HeapSort {

	static int[] array;
	static int n;
	static int left;
	static int right;
	static int largestNumber;

	public static void createHeap(int[] a) {
		array = a;
		n = (array.length - 1);

		for (int i = n / 2; i >= 0; i--) {
			maxHeap(i);
		}
	}

	private static void maxHeap(int i) {

		left = 2 * i;
		right = 2 * i + 1;
		
		if(left <= n && array[left] > array[i]){
			largestNumber = left;
		}else{
			largestNumber = i;
		}
		
		if(right <= n  && array[right] > array[largestNumber]){
			largestNumber = right;
		}
		
		if(largestNumber != i){
			swap(i, largestNumber);
			maxHeap(largestNumber);
		}
	}

	private static void swap(int i, int largestNumber2) {
		
		int temp = array[i];
		array[i] = array[largestNumber2];
		array[largestNumber2] = temp;
		
	}
	
	public static void sort(int[] a){
		array = a;
		createHeap(array);
		for(int i=n; i>0; i--){
			swap(0, i);
			n=n-1;
			maxHeap(0);
		}
		
	}
	

}
