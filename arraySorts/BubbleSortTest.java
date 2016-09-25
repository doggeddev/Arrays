package arraySorts;

public class BubbleSortTest {

	public static void main(String[] args) {

		for (int count = 0; count < 10; count++) {
			int worstCase[] = { 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

			for (int k = 0; k < worstCase.length; k++) {
				System.out.print(worstCase[k] + ", ");
			}

			System.out.print(" Array Length:" + worstCase.length + "-> ");

			int b[] = new int[worstCase.length];
			b = BubbleSort.bubbleSort(worstCase);

			for (int i = 0; i < b.length; i++) {
				System.out.print(b[i] + ", ");
			}
			System.out.println(" ");
		}

	}

}
