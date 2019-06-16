package Chapter05;

public class InSortedApp {

	public static void main(String[] args) {
		int size =10;
		Link[] linkArray = new Link[size];
		for(int j=0;j<size;j++) {
			int n = (int)(Math.random()*99);
			Link newLink = new Link(n);
			linkArray[j] = newLink;
		}
		// display array contents 
		System.out.print("Unsorted array: ");
		for(int j=0; j<size;j++) {
			System.out.print(linkArray[j].dData+ " ");
		}
		System.out.println("");
		InSortedList theSortedList = new InSortedList(linkArray);
		for(int j=0; j<size;j++) {
			linkArray[j] = theSortedList.remove();
		}
		System.out.print("Sorted Array: ");
		
		for(int j=0; j<size; j++) {
			System.out.print(linkArray[j].dData+ " ");
		}
		System.out.println("");

	}

}
