package Chapter05;

/**
 * 
 * Chapter 05 - Linked List A Simple Linked List inserting item at the beginning
 * Deleting the item at the beginning iterating through the list to display its
 * contents
 */

// LinkList App 
class LinkListApp {
	public static void main(String[] args) {
		LinkList theList = new LinkList();
		theList.insertFirst(22, 2.99);
		theList.insertFirst(44, 4.99);
		theList.insertFirst(66, 6.99);
		theList.insertFirst(88, 8.99);
		// display
		theList.displayList();
		/*while (!theList.isEmpty()) { // looping until empty
			// remove links until the list is empty
			Link aLink = theList.removeFirst();
			System.out.println("Deleted");
			aLink.displayLink();
			System.out.println();
		}
		theList.displayList();*/
		
		// -------------------- Listing 5.2 / Finding and deleting specific element ------------------------
		Link fLink = theList.find(44);
		if(fLink != null)
			System.out.println("Found Link with key " + fLink.iData);
		else 
			System.out.println("cant find link ");
		Link dLink = theList.delete(66);
		if(dLink != null)
			System.out.println("Deleted link key : " + dLink.iData);
		else
			System.out.println("cant delete link ");
		theList.displayList();
		
	}
}

