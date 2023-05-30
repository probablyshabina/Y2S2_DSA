package queues;

public class circularQueue {
	private int[] queue;
	private int maxSize;
	private int front;
	private int rear;
	private int noOfItems;
	

	public circularQueue(int size) {
		this.maxSize = size;
		queue = new int[maxSize];
		front = 0;
		rear = -1;
		noOfItems = 0;
	}
	
	public void insert(int value) {
		if(isFull()) {
			System.out.println("Queue is full");
		}
		else {
			if(rear == maxSize - 1)
				rear = -1;
			rear++;
			queue[rear] = value;
			noOfItems++;
		}
	}
	
	public void remove() {
		if(isEmpty()) {
			System.out.println("Queue is full");
		}
		else {
			if(front == maxSize)
				front = 0;
			front++;
			noOfItems--;
		}
	}
	
	public boolean isEmpty() {
		return noOfItems == 0;
	}
	
	public boolean isFull() {
		return noOfItems == maxSize;
	}
}
