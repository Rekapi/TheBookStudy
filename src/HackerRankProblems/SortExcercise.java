package HackerRankProblems;

import java.util.Scanner;

class SortExcercise {
	/**
	 * write a program taking data array from the user and then sort it 
	 * 
	 */
	public static void main(String[] args) {
		int Arrsize = 10;
		AllTypOfSorting arr;
		arr = new AllTypOfSorting(Arrsize);
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<Arrsize;i++) {
			//	int items = scan.nextInt();
			arr.insert(scan.nextInt());
		}
		System.out.println("");
		arr.display();
		System.out.println("");
	//	arr.BubSort(); // bubble sorting
	//	arr.display();
//		System.out.println("");
//		arr.SelectionSort();
//		arr.display();
//		System.out.println("");
		arr.insertionSort();
		arr.display();
		
	}
}
