package arraySorts;

import java.util.Random;

public class BubbleSortTest {

	public static void main(String[] args) {
				
		final int QUANTITY_TO_SORT = 30;
		Random rand = new Random();		
		
//		int a[] = new int[QUANTITY_TO_SORT];
		
		
			
	/*		for(int i = 0; i < a.length; i++){
				
				a[i] = 0;
			}
			for (int i = 0; i < QUANTITY_TO_SORT; i++) {
				a[i] = rand.nextInt(900);

			}

		*/	
		for (int count = 0; count < 10; count++) {
			int worstCase[] = {20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
			
			
			for(int k = 0; k < worstCase.length; k++){
				System.out.print(worstCase[k] + ", ");
			}
			
			System.out.print(" Array Length:" + worstCase.length + "-> ");
			
			int b[] = new int[worstCase.length];
			b = BubbleSort.bubbleSort(worstCase);
									
			for (int i = 0; i < b.length; i++) {
				System.out.print(b[i]+ ", ");
				}
				System.out.println(" Swap Count: " + BubbleSort.getCounter());
				
			}
			
		}

	

}
