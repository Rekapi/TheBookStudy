package Chapter04.Stack;

/**
 * Data structure and algorithms
 * chapter 04
 * Listing 4.2 - reversing a word
 * getting a word from the user and return it reversed
 */
public class Reverser {
    private String input;
    private String output;
    public Reverser(String in){
        input =in ;
    }
    // reversing method
    public String doRev(){
        int stackSize = input.length(); // inner method for Strings - returning the maxsize of the word
        StackW theStack = new StackW(stackSize); // make stack
        for(int j =0;j<stackSize;j++){
               char ch = input.charAt(j); // get a character from input
            theStack.push(ch); // push it into stack
        }
        output = "";
        while (!theStack.isEmpty()) { // true statement
            char ch = theStack.pop(); // pop a char out side the stack
            output = output + ch; // append to output
    }
        return output;
    }
}
