package arraySorts;

public class InsertionSortTester {

	public static void main(String[] args) {
		
		int[] test = {10,9,8,7,6,5,4,3,2,1};
		
		InsertionSort.insertionSort(test);
		
		for(int item: test){
			System.out.print(item + " ");
		}

	}

}
