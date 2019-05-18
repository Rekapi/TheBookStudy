package Chapter02;
    /**
     * Data Structure and Algotithms book 
     * chapter 02 
     * Listing 2.4
     * demonstrate ordered array class 
     * the same as highArray class in Listing 2.3
     * the main difference is that find() uses a binary search
     */
class OrdArrayL24 {
    private long[] a;
    private int nElem;

    // constructor with parameter 
    public OrdArrayL24(int max){
        a = new long[max];
        nElem =0;
    }

    public int size(){
        return nElem;
    }

    public int find(long searchKey){
        int lowerBound =0;
        int upperBound = nElem-1;
        int curIn;

        while(true){
            curIn =(lowerBound+upperBound)/2; // in the half 
            if (a[curIn] == searchKey) {
                return curIn; // found it
            }else if (lowerBound > upperBound) {
                return nElem; // cant find 
            } else {
                if(a[curIn] < searchKey)
                lowerBound = curIn +1; // its in upper half 
                else
                upperBound = curIn-1; // its in lower half 
            }
        } 
    } // End of find method

    public void insert(long value){
        int j;
        for(j=0;j<nElem;j++)
        if(a[j] > value) // linear search
        break;
        for(int k=nElem;k>j;k--) //move bigger one ones up
        a[k]=a[k-1];
        a[j]=value; // insert it 
        nElem++; // increment size of the array   
    } // end of insert method 

    public boolean delete(long value){
        int j = find(value); // looking for the item to delete it 
        if(j == nElem) // you get to the end and didnt find the item u looking for 
        return false;
        else {
            for(int k=j; k<nElem;k++) // iterate throw the array and move bigger ones up
            a[k] = a[k+1];
            nElem--; // decrement the size of the array 
            return true;
        }
    } // end of delete method 

    public void display(){
        for(int j=0;j<nElem;j++)
        System.out.print(a[j] + " ");
        System.out.println("");
    } // end of display method 
}
