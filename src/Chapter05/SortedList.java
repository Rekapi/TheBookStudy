package Chapter05;
/**
 * 
 * Listing 5.6 
 * Inserting element in sorted list 
 */

public class SortedList {
	
	private Link first;
	
	// constructor 
	public SortedList() {
		first = null;
		
	}
	// is Empty method 
	public boolean isEmpty(){
		return (first == null);
	}
	// insersion method 
	public void insert(double key) {
		
		Link newlink = new Link(key);
		Link previous = null; 
		Link current = first;
		 while (current != null && key > current.dData) {
			 previous = current;
			 current = current.next;
		 }
		 if (previous == null) 
			 first = newlink;
		 else
			 previous.next = newlink;
		 newlink.next = current;
	}
	// remove 
	public Link remove() {
		Link temp = first;
		first = first.next;
		return temp;
	}
	// display 
	public void display() {
		System.out.print("List (first--> last ): ");
		Link current = first;
		while(current != null) { // when current becoming null at the end of the list 
			current.displayLinks();
			current = current.next; 
		}
		System.out.println("");
	}
	
	// SortedList APP class 
	public static class SortedListApp{
		public static void main(String[] args) {
			SortedList thesortedList = new SortedList();
			thesortedList.insert(20);
			thesortedList.insert(40);
			
			thesortedList.display();
			thesortedList.insert(10);
			thesortedList.insert(30);
			thesortedList.insert(50);
			thesortedList.display();
			// removing an item
			thesortedList.remove();
			thesortedList.display();
		}
	}
}
