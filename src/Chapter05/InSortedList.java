package Chapter05;
/**
 * Chapter 5 - Listing 5.7 
 * Insertion sort Linked List
 */

public class InSortedList {
	private Link first;
	public InSortedList() {
		first = null;
	}
	public InSortedList(Link[] linkArr) {
		first =null;
		for(int j=0; j<linkArr.length;j++) {
			insert(linkArr[j]);
		}
	}
	public void insert(Link k) {
		Link previous = null;
		Link current = first;
		
		while(current != null && k.dData >current.dData) {
			previous =current;
			current =current.next;
		}
		if(previous == null) 
			first = k;
		else 
			previous.next = k;
		k.next=current;
	}
	
	public Link remove() {
		Link temp = first;
		first = first.next;
		return temp;
	}
}
