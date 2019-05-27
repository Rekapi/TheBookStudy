package Chapter05;

public class Link {
	public int iData; // data item
	public double dData; // data item
	public Link next; // next link in list
	// constructor

	public Link(int id, double dd) {
		iData = id;
		dData = dd;
	}

	// display Link
	public void displayLink() {
		System.out.println("{" + iData + "," + dData + "}");
	}
}

