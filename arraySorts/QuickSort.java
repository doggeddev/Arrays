package arraySorts;

public class QuickSort {
	   public static void swap (int array[], int i, int j) {
	      int temp = array[i];
	      array[i] = array[j];
	      array[j] = temp;
	   }
	 
	   public static int partition(int array[], int first, int length) {
	      
		  int pivot = array[first]; //set pivot to beginning of array on first pass
	      
	      while (first < length) {
	      
	    	  while (array[first] < pivot)
	    		  first++;
	    	  
	    	  while (array[length] > pivot)
	    		  length--;
	         
	    	  swap (array, first, length);
	      
	      }
	      return first;
	   }
	 
	   public static void Quicksort(int array[], int first, int length) {
	      
		  if (first >= length)
			  return; //make sure array isn't empty or invalid data entered
	      
	      int pivotIndex = partition(array, first, length);
	      
	      Quicksort(array, first, pivotIndex); 
	      Quicksort(array, pivotIndex+1, length);
	   }
}