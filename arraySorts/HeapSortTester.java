package arraySorts;

import java.util.Arrays;
import java.util.Random;

public class HeapSortTester {

	 public static void main(String[] args) {
	    
		 int[] randomInts = new int[100];
		 int[] bubble = Arrays.copyOf(randomInts, randomInts.length);
		 int[] heap = Arrays.copyOf(randomInts, randomInts.length);
		 Random rand = new Random();
		 

		 
		 for (int i = 0; i < randomInts.length; i++ ){
			 randomInts[i] =  rand.nextInt(1000000); 
			
		 }
		 long endTime;
		 long startTime = System.currentTimeMillis();
		 BubbleSort.bubbleSort(bubble);
		 endTime = System.currentTimeMillis();
		 System.out.println("Bubble sort took: " + (endTime - startTime + "ms"));
		 
		 startTime = System.currentTimeMillis();
		 HeapSort.sort(heap);
		 endTime = System.currentTimeMillis();
		 System.out.println("Heap sort took: " + (endTime - startTime + "ms"));
		 
	   }
}
