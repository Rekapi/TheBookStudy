package HackerRankProblems;

public class BubbleSorting {
	
	private static int nElem;
	private int[] matrx;
	
	public static void main(String[] args) {
		
		
	}

	private static void swap(int one, int two) {
			int temp = one; 
			one = two;
			two = temp;
	}
	
	public void insert(int value) {
		matrx[nElem] = value;
		nElem++;
	}
	
	

}
