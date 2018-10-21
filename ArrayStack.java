
public class ArrayStack implements Stack{
	private Object[] arr;
	private int top;
	
	public ArrayStack() {
		arr = new Object[1];
		top = -1;
	}
	@Override
	public void push(Object item) {
		if(top  >= arr.length -1 ) {
			growArr();
		}
		top++;
		arr[top] = item;
		
	}
	
	private void growArr(){
		Object[] newArr = new Object[arr.length*2];
		for(int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		arr = newArr;
	}
	
	@Override
	public Object pop() {
		if(!empty()) {
			return arr[top--];
		}
		return null;
	}

	@Override
	public Object peek() {
		if(!empty()) {
			return arr[top];
		}
		return null;
	}

	@Override
	public boolean empty() {
		if(top == -1) {
			return true;
		}
		return false;
	}
	public static void main(String args[]) {
		ArrayStack as = new ArrayStack();
		as.push("A");
		System.out.println(as.peek());
		as.push("B");
		
	}

}
