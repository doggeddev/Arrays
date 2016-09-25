package arraySorts;

public class SeletectionSortTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] test = {4,6,10,3,12,99,46,2,21,53,32,108,1};
		
		for (int item:SelectionSort.sortArray(test)){
			System.out.print(item + ", ");
		}

	}

}
