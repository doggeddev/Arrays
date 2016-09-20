
public class ArrayStackTester {
	
	
	public static void main(String[] args) throws Exception {
		
	ArrayStack<Integer> astack = new ArrayStack<Integer>(5);
	
    for(int i = 0; i < 5; i++){
    	astack.push(i);
    }
    
    System.out.println(astack.toString());
	System.out.println(astack.pop());
	System.out.println(astack.toString());
	System.out.println(astack.pop());
	System.out.println(astack.toString());
	System.out.println(astack.pop());
	System.out.println(astack.toString());
	System.out.println(astack.peek());
	astack.push(100);
	astack.push(200);
	astack.push(300);
	System.out.println(astack.toString());
	System.out.println(astack.peek());
	}

}
