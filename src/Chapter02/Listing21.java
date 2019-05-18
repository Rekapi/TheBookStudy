package Chapter02;
/**
 * This chapter 02 of the book of data structure and algohrithms
 * Chapter 02 - Arrays 
 */
public class Listing21 {

	// Listing 2.1 page 66 
	public static void main(String[] args) {
		long[] arr; 
		arr = new long[100];
		int nElems =0;
		long searchKey;
		// insert 10 items 
		arr[0] = 77;
		arr[1] = 99;
		arr[2] = 44;
		arr[3] = 55;
		arr[4] = 22;
		arr[5] = 88;
		arr[6] = 11;
		arr[7] = 00;
		arr[8] = 66;
		arr[9] = 33;
		nElems = 10;

		int j;
		for(j=0;j<nElems;j++){
			System.out.print(arr[j] + " "); // display items
			System.out.println(" ");
		}
		// ----------------------------------------------
		searchKey =66;  // find item with key 66
		for(j =0;j<nElems;j++)
			if(arr[j] == searchKey) // found item?
				break;  // yes, exit before end 
			
			if(j == nElems)
				System.out.println("Cant find " + searchKey); // yes
			else
				System.out.println("Found " + searchKey);
			// -----------------------------------------------------
		searchKey = 55; // delete item from the list with key 55
		for(j=0;j<nElems;j++)
		if(arr[j] == searchKey)
			break;
			for(int k =j; k<nElems-1;k++) // move higher ones down 
			arr[k] = arr[k+1];
			nElems--; // decrement size of the array 
			// -----------------------------------------------------
			for(j=0;j<nElems;j++)
			System.out.print(arr[j] + " "); // display items 
			System.out.println(" ");
		}
	}

