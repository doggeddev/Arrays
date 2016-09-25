package arraySorts;

public class BubbleSort {
	static int[] arrayToSort;

	public static int[] bubbleSort(int[] toSort) {

		arrayToSort = toSort;
		int len = arrayToSort.length;
		for (int i = 0; i < len; i++) {

			for (int j = 1; j < len; j++) {

				if (arrayToSort[j - 1] > arrayToSort[j]) {
					swap(j - 1, j, arrayToSort);

				} else if (j == (len)) {
					return arrayToSort;
				}

			}

		}
		return arrayToSort;

	}

	private static void swap(int i, int index, int[] x) {
		// Three legged swap
		int temp = x[i];
		x[i] = x[index];
		x[index] = temp;

	}
}
