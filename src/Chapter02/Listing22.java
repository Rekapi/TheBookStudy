package Chapter02;
import Chapter02.lowArray;
public class Listing22 {

	// Listing 2.2 page 69
	// divide it into two classes
	public static void main(String[] args) {
		lowArray arr;
		arr = new lowArray(100);
		int nElem = 0;
		int j; // loop counter

		// insert 10 items into the list
		arr.setElem(0, 77);
		arr.setElem(1, 99);
		arr.setElem(2, 44);
		arr.setElem(3, 55);
		arr.setElem(4, 22);
		arr.setElem(5, 88);
		arr.setElem(6, 11);
		arr.setElem(7, 00);
		arr.setElem(8, 66);
		arr.setElem(9, 33);
		nElem = 10;

		for (j = 0; j < nElem; j++) { // display items
			System.out.print(arr.getElem(j) + " ");
			System.out.println(" ");
		}
		int searchKey = 26; // searching for 26
		for (j = 0; j < nElem; j++) {
			if (arr.getElem(j) == searchKey) {
				break;
			}
			if (j == nElem) {
				System.out.println("Cant find " + searchKey);
			} else {
				System.out.println("Found " + searchKey);
			}
		}
		// deleting 55
		searchKey = 55;
		for (j = 0; j < nElem; j++) {
			if (arr.getElem(j) == 55) {
				break;
			}
			for (int k = j; k < nElem; k++) {
				arr.setElem(k, arr.getElem(k + 1));
				nElem--;
			}
		}
		// display items
		for (j = 0; j < nElem; j++) {
			System.out.print(arr.getElem(j) + " ");
			System.out.println(" ");
		}

	}
}
