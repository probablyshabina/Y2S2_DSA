package lecture;

public class Node {

	int key;
	Node leftChild; //if the key is higher
	Node rightChild;// if this node's key is higher
	
	//right.key > key > left.key
	
	Node(){
		this.key = 0;
		this.rightChild = null;
		this.leftChild = null;
	}
	
	Node(int val, Node right, Node left){
		this.key = val;
		this.rightChild = right;
		this.leftChild = left;
	}
	
	void displayNode(){
		System.out.println(key);
	}
}
