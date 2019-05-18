package HackerRankProblems;

class AllTypOfSorting {
	private int[] a;
	private int nElem;

	public AllTypOfSorting(int maxSize) {
		a = new int[maxSize];
		nElem = 0;
	}

	// inserting items
	public void insert(int value) {
		a[nElem] = value;
		nElem++;
	}

	// display
	public void display() {
		for (int i = 0; i < nElem; i++) {
			System.out.print(a[i] + "  ");
		}
		System.out.println("  ");
	}

	// bubble sort
	public void BubSort() {
		int out, in;
		for (out = nElem - 1; out > 1; out--) {
			for (in = 0; in < out; in++) {
				if (a[in] > a[in + 1]) { // < meaning descading sorting 
					swap(in, in + 1);
				}
			}
		}
	}

	// selectionSort
	public void SelectionSort() {
		int out, in, min;
		for (out = 0; out < nElem - 1; out++) {
			min = out;
			for(in = out+1; in<nElem-1;in++) {
				if(a[in] <a[min]) {
					min =in;
					swap(out,min );
				}
			}
		}
	}
	
	// InsertionSort 
	public void insertionSort() {
		int in, out;
		for(out =1;out<nElem; out++) {
			int temp = a[out];
			in = out ;
			while(in>0 && a[in-1]>=temp) {
				a[in] = a[in-1];
				--in;
			}
			a[in] = temp;
		}
	}

	private void swap(int one, int two) {
		int temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	}
}
