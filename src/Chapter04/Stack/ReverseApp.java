package Chapter04.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseApp {
    public static void main(String[] args) throws IOException {
        String input, output;
        while (true){
            System.out.println("Enter a String to be reversed");
            System.out.flush();
            input = getString(); // read string from the user
            if(input.equals(""))  // check if the user not write anything
                break; // quit if enter
            // making reverse operation
            Reverser reverser = new Reverser(input);
            output = reverser.doRev();
            System.out.println("Reversed  :" + output);
        }
    }
    public static String getString() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader Br = new BufferedReader(inputStreamReader);
        String s = Br.readLine();
        return s;
    }
}
