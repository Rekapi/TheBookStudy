package Chapter04.Queue;

/**
 * chapter 04
 * Queue
 * Listing 4.4
 */
class Queue {
    private int maxsize;
    private long[] qurArray;
    private int front;
    private int rear;
    private int nItems;
    public Queue(int s){
        maxsize = s;
        qurArray = new long[maxsize];
        front = 0;
        rear = -1;
        nItems =0;
    }
    // inserting items
    public void Insert(long j){
        if(rear ==maxsize -1)
            rear =-1;
        qurArray[++rear] = j;
        nItems++;
    }
    // take item from front of queue
    public long remove(){
        long temp=qurArray[front++];
        if(front == maxsize)
            front =0;
        nItems--;
        return temp;
    }
    // peek at front queue
   public long peekFront(){
        return qurArray[front];
   }
   public int size(){
        return nItems;
   }
   public boolean isEmpty(){
        return (nItems ==0);
   }
   public boolean isFull(){
        return (nItems==maxsize);
   }
}
