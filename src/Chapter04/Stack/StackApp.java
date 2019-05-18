package Chapter04.Stack;

 class StackApp {
    public static void main(String[] args) {
        StackX theStack = new StackX(10); // size of the stack is 10
        theStack.push(20); // pushing items into the stack
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);
        while(!theStack.isEmpty()) {  //  true statement (check if the stack is not empty
            long value = theStack.pop(); // delete item from the top of the stack
            System.out.print(value);
            System.out.print("  ");
        }
        System.out.println(" ");
    }
}
