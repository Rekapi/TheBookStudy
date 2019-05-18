package Chapter04.Queue;

public class QueueApp {
    public static void main(String[] args) {
        Queue queue = new Queue(5); // number of items in queue
        queue.Insert(10);
        queue.Insert(20);
        queue.Insert(30);
        queue.Insert(40);
        // remove items
        queue.remove(); // remove 10
        queue.remove(); // remove 20
        queue.remove(); // remove 30
        // insert 4 difference items
        queue.Insert(50);
        queue.Insert(60);
        queue.Insert(70);
        queue.Insert(80);
        while (!queue.isEmpty()) {// true statement
            long n = queue.remove();  // remove all
            System.out.print(n);
            System.out.println(" ");
        }
        System.out.println(" ");
    }
}
