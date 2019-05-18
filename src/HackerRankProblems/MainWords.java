package HackerRankProblems;


public class MainWords {

	public static void main(String[] args) {
		int maxsize = 100;
		SortingWords arr;
		arr = new SortingWords(maxsize);
		
		arr.insertWords("Tony", "Patty","Adams");
		System.out.println("Before Sorting : \n");
		arr.displayWords();
		System.out.println(" ");
		System.out.println("After Sorting \n");
		arr.WordsSort();
		arr.displayWords();
	}

}
