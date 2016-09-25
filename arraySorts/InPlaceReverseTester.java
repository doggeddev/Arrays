package arraySorts;

public class InPlaceReverseTester {

	public static void main(String[] args) {
	int[] array = {1};
	int[] array1 = {8,7,6,5,4,3,2,1};
	int[] array2 = {9,8,7,6,5,4,3,2,1};
	int[] array3 = {10,9,8,7,6,5,4,3,2,1};
	int[] array4 = {11,10,9,8,7,6,5,4,3,2,1};
	int[] array5 = {12,11,10,9,8,7,6,5,4,3,2,1};
	
	Object[] arrays = {array, array1, array2, array3, array4, array5};
	
	for(Object anArray: arrays){
		InPlaceReverse.inPlaceReverse((int[]) anArray);
		for(int items: (int[]) anArray)
			System.out.print(items + ", ");
		System.out.println("\n");
		}

	}

}
