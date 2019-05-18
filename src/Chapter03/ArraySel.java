package Chapter03;

 class ArraySel {
	
	/**
     * Data Structure and Algotithms book 
     * chapter 03 
     * Listing 3.2 Selection Sort 
	*/
	private long[] a;
	private int nElem;
	public ArraySel(int max) {
		a = new long[max];
		nElem =0;
	}
	// inserting items into array 
	public void insert(long value) {
        a[nElem] =value;
        nElem++;
	}
	// displaying the array 
	public void display() {
		for(int i=0;i<nElem;i++) {
			System.out.print(a[i] + "  ");
		}
		System.out.println(" ");
	}
	
	public void SelectionSort() {
		
		int out, in, min;
		for(out=0;out<nElem-1;out++) { // starting from the begining and increment
			min =out;
			for(in = out+1; in<nElem;in++)
				if(a[in] < a[min])
					min = in;
			swap(out, min);
		}
	}
	private void swap(int one, int two) {
		long temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	}
}
