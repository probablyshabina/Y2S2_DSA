package main;

public class MainApp {

	public static void main(String[] args) {
		LinkList theList = new LinkList(); // make new list
		theList.insertFirst(22);
		theList.insertFirst(44);
		theList.insertFirst(55);
		theList.insertFirst(66);
		theList.insertFirst(77);
		
		theList.displayList();
		
		while(!theList.isEmpty()) {
			Link aLink = theList.deleteFirst(); 
			System.out.print("Deleted ");
			aLink.displayList();
			System.out.println(" ");
		}
		
		theList.displayList();
	}
}
