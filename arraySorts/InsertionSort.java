package arraySorts;

public class InsertionSort {

	static int[] a; 
	static int elementInsert;
	static int holeToInsert;
	
	public static int[] insertionSort(int[] toSort){
		a = toSort;
		return sortArray();
	}
	
	private static int[] sortArray(){
		
		for(int i = 1; i < a.length; i++){
			elementInsert = a[i];
			holeToInsert = i;
			
			while(holeToInsert > 0 && a[holeToInsert-1] > elementInsert){
				a[holeToInsert] = a[holeToInsert - 1];
				holeToInsert = holeToInsert - 1;
			}
			
			a[holeToInsert] = elementInsert;
		}
		return a;
	
	}
}
