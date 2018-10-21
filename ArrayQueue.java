
public class ArrayQueue implements Queue{
	private int head;
	private int tail;
	private Object[] arr;
	
	public ArrayQueue() {
		arr = new Object[10];
		head = 0;
		tail = 0;
	}
	private void growArr(){
		Object[] newArr = new Object[arr.length*2];
		for(int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		arr = newArr;
	}
	public void enqueue(Object obj) {
		if(arr.length -1 == tail) {
			growArr();
		}
		arr[tail] = obj;
		tail++;
		if(tail >= arr.length){
			tail = 0;
		}
	}

	@Override
	public Object dequeue() {
		if(empty()) {
			return null;
		}
		
		Object obj = arr[head];
		obj = arr[head];
		head++;
		if(head >= arr.length) {
			head = 0;
		}

		return obj;

	}

	@Override
	public boolean empty() {
		if(head == tail) {
			return true;
		}
		return false;
	}
}
