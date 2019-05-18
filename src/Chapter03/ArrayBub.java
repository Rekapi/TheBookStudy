package Chapter03;

class ArrayBub {
    /**
     * Data Structure and Algotithms book
     *      * chapter 03
     *      * Listing 3.1 Bubble Sort
     - the idea is to put the smallest item at the beginning of the array (index 0)
      and the largest at the end (index nElem- 1) 
     - The loop counter out int thr outer for loop starts at the end of the array (nElem-1)
     and decrements itself each time.
     - the out variables moves left after each pass by in so that items that already sorted are no 
     longer involved in the algorithm
     - The inner counter starts from the begining of the array and increment itself 
     - Within the inner loop the two array cells pointed by in and in+1 are compared and swapped 
     if the on in in is larger then n+1 .
     
     * bubble sort algohrithm :
     * 1. creating array
     * 2. loop through the array from the greater index (nElem -1) 
     * 3. loop through the array from the begining comparing in and in+1
     * 4. if in > in+1 then swap otherwise pass to the next index 
     */
    private long[] a;
    private int nElem;

    public ArrayBub(int max){ // constructor 
        a = new long[max]; // length of the array = max
        nElem=0; // no items yet
    }

    // inserting elements into array method
    public void insert(long value){
        a[nElem] =value;
        nElem++;
    }

    // displaying the array method 
    public void display(){
        for(int j=0;j<nElem;j++)
        System.out.print(a[j] + " ");
        System.out.println(" ");
    }

    // bubble sorting method 
    public void bubbleSort(){
      int out, in;
      for(out=nElem-1;out>1;out--) // outer loop (backward) -begin from the last number in the array 
      for(in=0;in<out; in++) // inner loop (forward) - begin from the begining of the array 
      if(a[in] > a[in+1]) // out of order 
      swap(in, in+1); // swap them  if the condition is true otherwise pass in.
    }

    // swapping to sort 
    private void swap(int one, int two){
        long temp=a[one];
        a[one] = a[two];
        a[two]=temp;
    }

}    
    
