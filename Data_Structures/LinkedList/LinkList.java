package main;

public class LinkList {
	Link first;
	/* Assumes Link is not full or empty*/
	public LinkList() {
		first = null;
	}
	
	void insertFirst(int id) {
		Link newLink = new Link(id);
		newLink.nextLink = first;  //first still refers to the first already exists
		first = newLink; //first is changed to the newly created link
	}
	
	Link deleteFirst() {
		Link tempLink = first; // saves the current first in a temp location to return
		first = first.nextLink; //assigns the current first Link's next as the new first Link
		return tempLink;
	}
	
	void displayList() {
		Link currentLink = first;
		while (!(currentLink == null)) {
			currentLink.displayList();
			currentLink = currentLink.nextLink;
		}
		System.out.println(" ");
	}
	
	boolean isEmpty() {
		return (first == null);
	}
	
	
}
