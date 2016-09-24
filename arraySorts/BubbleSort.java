package arraySorts;

public class BubbleSort {
	static int counter;
	static int[] arrayToSort;
	public static int[] bubbleSort(int[] toSort) {
		counter = 0;
		
		arrayToSort = toSort;
		int len = arrayToSort.length;
		boolean notSorted = true;
		
		for (int i = 0; i < len; i++) {
			
			for (int j = 1; j < len; j++) {
				
				if (arrayToSort[j - 1] > arrayToSort[j]) {
					counter++;
					swap(j - 1, j, arrayToSort);
					
				}else if( j == (len)){
					return arrayToSort;
				}
				
			}
			
			
		}
		return arrayToSort;

	}



	/**
	 * @return the counter
	 */
	public static int getCounter() {
		return counter;
	}



	private static void swap(int i, int index, int[] x) {
		// Three legged swap
		int temp = x[i];
		x[i] = x[index];
		x[index] = temp;
		
		
	}
}
