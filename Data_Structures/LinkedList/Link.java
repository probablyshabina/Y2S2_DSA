package main;

public class Link {

	int iData;
	Link nextLink;
	
	Link(int id){
		iData = id;
		nextLink = null;
	}
	
	void displayList() {
		System.out.println(iData);
	}
	
}
