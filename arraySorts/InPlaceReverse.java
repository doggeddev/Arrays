package arraySorts;

public class InPlaceReverse {
	
	public static int[] inPlaceReverse(int[] array){
		
		int end = array.length - 1;
		int middle = (array.length / 2); //if length is even, then array is divided into two separate list.
										//if length is odd (like 13), then 13/2 = 6.5. Assigning this to an INT type
										//removes the decimal portion, leaving 6 in the middle. 
		
		for(int front = 0; front < middle; front++, end--){
				
			if(front == end){ //if an odd length is encountered, then the middle element is in the correct spot, don't swap.
				return array;
			}else{
				int temp = array[front];
				array[front] = array[end];
				array[end] = temp;			
			}	
			
		}	
		
		return array;
	}

}
