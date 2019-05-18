package Chapter04.Queue;

/**
 * chapter 04
 * Queue
 * Listing 4.5
 * this implementation is without item count so remove all item count variables declaration
 */
class QueueL45 {
    private int maxsize;
    private long[] qurArray;
    private int front;
    private int rear;
   // private int nItems;
    public QueueL45(int s){
        maxsize = s +1 ; // array is 1 cell Larger
        qurArray = new long[maxsize];
        front = 0;
        rear = -1;
    //    nItems =0;
    }
    // inserting items
    public void Insert(long j){
        if(rear ==maxsize -1)
            rear =-1;
        qurArray[++rear] = j;
      //   nItems++;  this implementation is without an item count
    }
    // take item from front of queue
    public long remove(){
        long temp=qurArray[front++];
        if(front == maxsize)
            front =0;
        // nItems--;
        return temp;
    }
    // peek at front queue
   public long peek(){
        return qurArray[front];
   }
   public int size(){
        if(rear >= front )
            return rear-front+1;
        else
        return (maxsize-front) + (rear +1);
   }
   public boolean isEmpty(){
        return (rear+1 ==0); // true if queue is empty
   }
   public boolean isFull(){
        return (rear +2 ==maxsize);
   }
}
