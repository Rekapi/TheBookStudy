package Chapter05;


public class LinkList {
	private Link first; // refer to the first link on list

	public LinkList() {
		// constructor
		first = null;
	}

	public boolean isEmpty() {
		return (first == null); // true if list is empty
	}

	// insert method
	public void insertFirst(int id, double dd) {
		Link newLink = new Link(id, dd); // make new link
		newLink.next = first; // newLink --> first
		first = newLink; // first --> newLink and so on
	}

	// delete first
	public Link removeFirst() {
		Link temp = first;
		first = first.next;
		return temp;
	}

	// display list
	public void displayList() {
		System.out.println("List (First -->  Last) : ");
		Link curr = first;
		while (curr != null) {
			curr.displayLink();
			curr = curr.next;
		}
		System.out.println("");
	}
	
	// ----------------------------------------------------------------------// 
	// Listing 5.2 - finding and deleting specified Links 
	// finding specific link
	public Link find(int key) {
		Link curr = first;
		while(curr.iData != key) { // while no matching 
			if(curr.next == null ) // if end of the list 
				return null;
			else 
				curr = curr.next;
		}
		return curr;
	}
	
	// deleting specified link
	public Link delete(int key) {
		Link curr = first;
		Link previous = first;
		while(curr.iData != key) {
			if(curr.next == null)
				return null;
			else 
			{
				previous =curr; // go to next link 
				curr = curr.next;
			}
		}
		if(curr == first)
			first = first.next;
		else 
			previous.next = curr.next;
		return curr;
	}
}

















