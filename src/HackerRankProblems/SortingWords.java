package HackerRankProblems;

// this class is for sorting words 

public class SortingWords {
	private Words[] words;   // declaring the words objects as an array object 
	private int nElem;     // declaring the number of the elements in the array (words)
	
	// constructor 
	public SortingWords(int maxsize) {
		words = new Words[maxsize];  // maxsize : maximum size of this array 
		nElem = 0;   
	}
	
	// method for inserting words on array of word 
	public void insertWords(String firstWord, String secondWord, String thirdWord) {
		words[nElem] = new Words(firstWord); //,secondWord,thirdWord);
		words[nElem] = new Words(secondWord); 
		words[nElem] = new Words(thirdWord); 
		nElem++;    // incrementing the number of words on the array 
	}
	
	// method for displaying the words 
	public void displayWords() {
		for(int i=0; i< nElem;i++) {
			words[i].displayWords(); // this display method is from Words class
			System.out.println("");
		}
	} 
	
	// sorting method : this method for arranging the words in alphab. order
	public void WordsSort() {
		int in, out ;
		for(out=1; out< nElem;out++) {
			Words temp = words[out];
			in = out;
			if( in > 0  && words[in-1].getFirstWord().compareTo(temp.getSecondWord())>0) {
				words[in] = words[in-1];
				--in;
			}
			words[in] = temp;
		}
		
	}
	

}
