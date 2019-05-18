package Chapter03;

 class ArrayIns {
		/**
	     * Data Structure and Algotithms book 
	     * chapter 03 
	     * Listing 3.3 Insertion Sort 
		*/
	 private long [] a;
	 private int nElem;
	 public ArrayIns(int maxsize) {
		 a = new long[maxsize];
		 nElem =0;
	 }
	 
	 // insert method 
	 public void insert(long value) {
		 a[nElem] = value;
		 nElem++;
	 }
	 
	 // display method 
	 public void display() {
		 //System.out.println("");
		 for(int i =0; i< nElem;i++) {
			 System.out.print("  ");
			 System.out.print(a[i] + "  ");
		 }
		 System.out.println(" ");
	 }
	 
	 // insertion sort method
	 public void InsertionSort() {
		 int in, out;
		 for(out =1; out<nElem;out++) { // out is dividing line 
			 long temp = a[out]; // remove marked item 
			 in = out;  // start shift at out 
			 while (in>0 && a[in-1] >= temp) {  // until one is smaller 
				a[in] = a[in-1]; 
				--in;
			}
			 a[in] = temp;
		 }
	 }
}
