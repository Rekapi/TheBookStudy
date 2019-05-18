package Chapter04.Stack;

import java.io.IOException;

/**
 *  Chapter 04
 *  Listing 4.3
 */
class BracketsApp {
    public static void main(String[] args) throws IOException {
        String input;
        while (true){
            System.out.print("Enter string containing delimiters : ");
            System.out.flush();
            input = ReverseApp.getString();
            if(input.equals(""))
                break;
            BracketChecker checker = new BracketChecker(input);
            checker.check();
        }
    }
}
