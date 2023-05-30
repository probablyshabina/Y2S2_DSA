package lab2;

public class QueueX {
	private int[] queArray;
	private int maxSize;
	private int rear;
	private int front;
	private int noOfItems;
	

	QueueX(int s){
		this.maxSize = s;
		queArray = new int[maxSize];
		noOfItems = 0;
		front = 0;
		rear = 0;
	}
	
	public void insert(int j) {
		if (isFull()) 
			System.out.println("Queue is full");
		else {
			queArray[rear] = j;
			noOfItems++;
			rear++;
		}
	}
	
	public void remove() {
		if (isEmpty()) 
			System.out.println("Queue is empty");
		else {
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
	
	public int peekFront() {
		return queArray[front];
	}
	
	public int peekRear() {
		return queArray[rear - 1];
	}
	
	public void print(String printText) {
		while(front != rear){
			System.out.println(printText + " " + peekFront());
			remove();
		}
	}
}
