import java.util.Arrays;
/* Created by Richard Drexel
 * Date: 9/19/2016
 * 
 * A simple implementation of a stack class using an array.
 * It's nothing fancy, but it does work. 
 * 
 */

public class ArrayStack<T> {
	// Need to add error handling - stack size < 0, empty stack, stack full, etc

	private int stackSize = -1;
	private T[] arrayStack;
	private int topOfStack = -1;

	public ArrayStack(int size) {
		this.stackSize = size;
		this.setTopOfStack(0);
		this.arrayStack = (T[]) new Object[this.stackSize];

	}

	public T peek() {
		return arrayStack[getTopOfStack() - 1];
	}

	public T pop() {

		if (getTopOfStack() > 0) {
			setTopOfStack(topOfStack - 1);
			T poppedOff = arrayStack[getTopOfStack()];
			arrayStack[getTopOfStack()] = null;
			return poppedOff;
		} else {
			return null;
		}

	}

	public void push(T item) {

		if ((getTopOfStack()) < arrayStack.length) {
			arrayStack[this.topOfStack] = item;
			setTopOfStack(topOfStack + 1);
		} else {
			System.out.println("Stack is full");
		}
	}

	private void setTopOfStack(int i) {
		this.topOfStack = i;
	}

	public int getTopOfStack() {
		return topOfStack;
	}

	public int getStackSize() {
		return stackSize;
	}

	public T[] getArrayStack() {
		return arrayStack;
	}

	@Override
	public String toString() {
		return "ArrayStack [stackSize=" + stackSize + ", arrayStack=" + Arrays.toString(arrayStack) + "]";
	}

}