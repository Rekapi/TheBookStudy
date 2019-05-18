package Chapter04.Stack;

/**
 * Data Structure and algorithms book
 *  chapter 04
 *   Listing 4.2 - reversing words class
 */
class StackW {
    private int maxsize;
    private char[] stackArray;
    private int top;
    // constructor
   public StackW(int max){
        maxsize =max;
        stackArray = new char[maxsize];
        top = -1;
    }
    // push an item into stack
    public void push(char j){
       stackArray[++top] = j;
    }
    // pop an item into array (remove)
    public char pop(){
       return stackArray[top--];
    }
    // peek a top of the stack
    public char peek(){
       return stackArray[top];
    }
    // boolean method for Empty stack
    public boolean isEmpty(){
       return (top == -1);
    }
    // boolean method for full stack
    public boolean isFull(){
       return (top == maxsize);
    }
}
