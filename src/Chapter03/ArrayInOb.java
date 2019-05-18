package Chapter03;
import Chapter02.Person;
class ArrayInOb {
	/**
	 * Data Structure and Algotithms book
	 *  chapter 03 
	 *  Listing 3.4 Insertion Sort
	 */
	private Person[] a;
	private int nElem;
	// constructor 
	public ArrayInOb(int maxsize) {
		a = new Person[maxsize];
		nElem = 0;
	}

	public void insert(String last, String first, int age) {
		a[nElem] = new Person(last, first, age);
		nElem++;
	}

	// display method
	public void display() {
		for (int i = 0; i < nElem; i++) {
			a[i].displayPerson();
			System.out.println(" ");
		}
	}

	// sorting method
	public void insertionSort() {
		int in, out;
		for (out = 1; out < nElem; out++) {
			Person temp = a[out];
			in = out;
			while(in>0&&a[in-1].getLast().compareTo(temp.getLast())>0) {
				a[in] = a[in-1];
				--in;
			}
			a[in] = temp;
		}
	}

}
