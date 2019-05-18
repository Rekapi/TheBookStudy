package HackerRankProblems;

// this class is representing the words as objects 

public class Words {
	private String firstWord;
	private String secondWord;
	private String thirdWord;
	
	public Words(String first) {//, String second, String third) { // Constructor with parameters 
		firstWord = first;
		/*secondWord = second;
		thirdWord = third;*/
	}
	
	// Displaying your words on the console 
	public void displayWords() {
		System.out.print(" First Word : " + firstWord);
		System.out.print("    ,Second Word :   " + secondWord );
		System.out.println("    , Third Word : " + thirdWord);
	} 
	
	// get first word 
	public String getFirstWord() {
		return firstWord;
	}
	
	// get first word 
	public String getSecondWord() {
		return secondWord;
	}
	
	// get first word 
	public String getThirdWord() {
		return thirdWord;
	}
}	 


