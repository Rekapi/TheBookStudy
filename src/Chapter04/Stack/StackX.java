package Chapter04.Stack;
/**
 * Data Structure and Algorithms book
 * Chapter 04
 * Stacks and queues
 * Listing 4.1
 * */
class StackX {
    private int maxsize; // size of stack array
    private long[] stackArray;
    private int top;  // top of stack
    // constructor
      StackX(int s){
        maxsize = s;  // set array size
        stackArray = new long[maxsize]; // create array
        top =-1; // no items yet
    }
    // push method
    public void push(long j){  // push item in top of stack
        stackArray[++top] = j; // increment top to insert an item
    }
    // pop method
    public long pop(){
        return  stackArray[top--]; // take (delete) item from top of stack
    }
    // peek at top of stack
    public long peek(){
        return  stackArray[top];
    }
    public boolean isEmpty(){
        return  (top== -1); // true if stack is empty
    }
    public boolean isFull(){
        return (top == maxsize); // true if stack is full of element
    } // end of stack class
}
