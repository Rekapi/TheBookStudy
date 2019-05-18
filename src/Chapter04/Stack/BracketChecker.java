package Chapter04.Stack;

/**
 * Chapter 04
 * Listing 4.3
 */
class BracketChecker {
    private  String input;
    public BracketChecker(String in){
        input = in;
    }
    public  void check(){
        int stackSize = input.length();
        StackW theStack = new StackW(stackSize);
        for (int j = 0; j<stackSize;j++){
            char ch = input.charAt(j);
            switch (ch){
                case '{':
                case'[':
                case'(':
                    theStack.push(ch);
                    break;
                case '}':
                case']':
                case')':
                    if(!theStack.isEmpty()){
                        char chx = theStack.pop(); // pop and check
                        if((ch == '}' && chx != '{') ||
                                (ch == ']' && chx != '[') ||
                                (ch == ')' && chx != '('))
                            System.out.println("Error : " + ch + "   at   " + j);
                    }
                    else
                        System.out.println("Error : " + ch + "   at   " + j);
                    break;
                    default:
                        break;
            } // end switch
        } // end for loop
    }// end check method
} // end BracketChecker class
