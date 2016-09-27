package arraySorts;

import java.util.Arrays;

public class QuickSortTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] array = {20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
		
		int length = array.length - 1;
		
		System.out.println(Arrays.toString(array));
		
		QuickSort.Quicksort(array, 0, length);
				
		System.out.println(Arrays.toString(array));
	}

}
