package Chapter02;

// this class is adding class - interface one 
public class HighArrayL23 {
    /**
     * Data Structure and Algotithms book 
     * chapter 02 
     * Listing 2.3
     * demonstrate array class with high-level interface 
     */
    private long[] a; // ref to array 
    private int nElem; // number of data items S
    //----------------
    // constructor 
    public HighArrayL23(int max){ // constructor with int parameter 
        a = new long[max]; // create the array
        nElem =0; // its empty 
    }
    // ---------------
    // boolean method 
	public boolean find(long searchKey){  // finding method
        int j;
        for(j=0;j<nElem;) { // for each element in the array
            if(a[j] == searchKey) // condition for finding an item
               break; // exit if the item found 
            if(j == nElem) // gone to end without finding that item 
            return false;
            else 
            return true; // find nothing 
        }
		return true;
    } // end of find method 

    public void insert(long value){ // inserting items method 
        a[nElem] = value; // insert item 
        nElem++; // increment size of the array 
    }

    public boolean delete(long value){ // deleting item from the array 
        int j;
        for(j=0; j<nElem;j++) // looking for the specific item to delete
        if(value ==a[j])
        break;
        if(j==nElem) // iam in the end aand nothing found 
        return false;
        else{
            for(int k=j;k<nElem;k++) // move higher ones down
            a[k] = a[k+1];
            nElem--;
            return true;
        }
    } // end of deleting method 
    public void display(){ // display array contents 
        for(int j=0;j<nElem;j++)
        System.out.print(a[j] + " ");
        System.out.print("");
    }
}