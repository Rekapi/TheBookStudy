package Chapter02;

    /**
     * Data Structure and Algotithms book 
     * chapter 02 
     * Listing 2.5
     * change datatype of array from long to string (personal data )
     */
public class DataArrayL25 {
    private Person[] a; // array of persons 
    private int nElem; // number of data item

    // constructor 
    public DataArrayL25(int max){
        a=new Person[max]; // create the array 
        nElem =0;
    }

   // @SuppressWarnings("unlikely-arg-type")
	public Person find(String searchName){ // find specified value
        int j;
        for(j=0; j<nElem; j++)
        if(a[j].getLast().equals(searchName)) // found item 
        break; // if false 
        if(j == nElem) // get to the end without finding anything
        return null;
        else // if false 
        return a[j];
    } // end of finding method 

    // put person into array 
    public void insert(String last, String first, int age){
        a[nElem] = new Person(last,first,age);
        nElem++; // increment size of array 
    }

    public boolean delete(String searchName){ // deleting items
        int j;
        for(j=0;j<nElem;j++)
        if(a[j].getLast().equals(searchName))
        break;
        if(j ==nElem)
        return false;
        else{
            for(int k=j; k<nElem;k++) // shift down 
            a[k] = a[k+1];
            nElem--;
            return true;
        }
    } // end of delete method 

    // displaying contacts 
    public void displayA(){
        for(int j=0;j<nElem;j++)
        a[j].displayPerson(); // display it 
    }
}
