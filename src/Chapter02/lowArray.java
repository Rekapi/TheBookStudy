package Chapter02;

public class lowArray {
	public long[] a ; // ref to array 
	public lowArray(int size){ // constructor 
		a = new long[size]; // create long array 
	}
	// ---------------------------
	public void setElem(int index, long value){ // set value
		a[index] = value;
	}
	public long getElem(int index){ // get  value 
		return a[index];
	}
}

