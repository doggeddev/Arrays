package arraySorts;

public class SelectionSort {

	public static int[] sortArray(int[] test) {
				
			int i, j, selector, temp;

			for (i = test.length - 1; i > 0; i--) {
				selector = 0; 
				
				for (j = 1; j <= i; j++) {
					if (test[j] > test[selector]) {
						selector = j;
					}
				}
				
				temp = test[selector];
				test[selector] = test[i];
				test[i] = temp;

			}		
		return test;

	}
}