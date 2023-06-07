package lecture;

import java.util.Currency;

public class Tree {

	Node root;
	
	Tree(){
		root = new Node(16, new Node(1, null, null), new Node(6, null, null));
	}
	
	Node find(int value){
		Node currentNode = root;
		
		while(currentNode.key != value) {
			if(value < currentNode.key)
				currentNode = currentNode.leftChild;
			else
				currentNode = currentNode.rightChild;

			if(currentNode == null)
				return null;
		}
		return currentNode;
	}
	
	void insert(int key) {
		Node newNode = new Node();
		newNode.key = key;
		
		if(root == null)
			root = newNode;
		else {
			Node currentNode = root;
			Node parentNode;

			while(true) {
				parentNode = currentNode;
				
				if(currentNode.key < key) {//Go right
					currentNode = currentNode.rightChild;
					
					if(currentNode == null) {//Is right node available
						parentNode.rightChild = newNode;//insert if available
						return;
					}
					//exit if right node is occupied and check the right node's left/right again
				}
				else {
					currentNode = currentNode.leftChild;
					
					if(currentNode == null) {
						parentNode.leftChild = newNode;
						return;
					}
				}
			}//end while
		}//end else if root is null
	}//end insert()
	
	boolean delete(int key) {
		Node findNode = root;
		Node parentNode = root;
		Boolean isLeftChild = true; 
		
		while(findNode.key != key) {
			parentNode = findNode; 
			if(key < findNode.key) {
				isLeftChild = true;
				findNode = findNode.leftChild;
			}
			else {
				isLeftChild = false;
				findNode = findNode.rightChild;
			}

			if(findNode == null)
				return false;

		}//when the loop is done findNode will be the node with the key
		//and isLeftChild will tell whether the child is left or right
		
		//check whether has no children
		if(findNode.leftChild == null && findNode.rightChild == null) {
			
			if (findNode == root) { //if the node is root
				root = null; //empty tree
			} 
			else if(isLeftChild){
				parentNode.leftChild = null;
			}
			else {
				parentNode.rightChild = null;
			}
		}
		//if has no right child -> has only left child
		else if(findNode.rightChild == null) {
			
			if (findNode == root) { //if the node is root
				root = findNode.leftChild;
			} 
			else if(isLeftChild){ //if the found node is a left child
				parentNode.leftChild = findNode.leftChild;
			}
			else {
				parentNode.rightChild = findNode.leftChild;
			}
		}
		//if has no left child -> has only right child
		else if(findNode.leftChild == null) {
			
			if (findNode == root) { //if the node is root
				root = findNode.rightChild;
			} 
			else if(isLeftChild){ //if the found node is a left child
				parentNode.leftChild = findNode.rightChild;
			}
			else {
				parentNode.rightChild = findNode.rightChild;
			}
		}
		//if has both the children
		else {
			// get successor of node to delete (current)
			Node successor = getSuccessor(findNode);
			// connect parent of current to successor instead
			if(findNode == root)
				root = successor;
			else if(isLeftChild)
				parentNode.leftChild = successor;
			else
				parentNode.rightChild = successor;
			
			// connect successor to current•s left child
			successor.leftChild = findNode.leftChild;
		} // end else two children
		
		// (successor cannot have a left child)
		return true;
	} // end delete()
	
	Node getSuccessor(Node delNode) {
		Node successorParent = delNode;
		Node successor = delNode;
		
		Node current = delNode.rightChild; // go to right child
		while(current != null) // until no more
		{
			successorParent = successor;
			successor = current;
			current = current.leftChild; // go to left child
		}
		
		if(successor != delNode.rightChild) // right child,
		{ // make connections
			successorParent.leftChild = successor.rightChild;
			successor.rightChild = delNode.rightChild;
		}
		return successor;
	}
	
	void traverseInOrder(Node localroot) {
		
		if(localroot != null) {
			traverseInOrder(localroot.leftChild);
			localroot.displayNode();
			traverseInOrder(localroot.rightChild);
			
		}
	}
	
	void traversePreOrder(Node localroot) {
		
		if(localroot != null) {
			localroot.displayNode();
			traversePreOrder(localroot.leftChild);
			traversePreOrder(localroot.rightChild);
		}
	}
	
	void traversePostOrder(Node localroot) {
		
		if(localroot != null) {
			traversePreOrder(localroot.leftChild);
			traversePreOrder(localroot.rightChild);
			localroot.displayNode();
		}
	}
	
}
