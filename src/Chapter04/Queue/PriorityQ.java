package Chapter04.Queue;
/**
 * Chapter 04
 * Priority Queue
 * Listing 4.6
 */
class PriorityQ {
    // array in sorted order, from max at 0 to min at size -1
    private int maxsize;
    private long[] queArray;
    private int nItems;

    // constructor with size of array parameter
    public PriorityQ(int s) {
        maxsize = s;
        queArray = new long[maxsize];
        nItems = 0; // starting from zero
    }

    // inserting items
    public void Insert(long item) {
        int j;
        if (nItems == 0)
            queArray[nItems++] = item;
        else {
            for (j = nItems - 1; j >= 0; j--) {
                if (item > queArray[j]) // if new item larger
                    queArray[j + 1] = queArray[j]; // shift upward
                else
                    break;
            }
            queArray[j + 1] = item;
            nItems++;
        }
    }

    // remove minimum item
    public long remove() {
        return queArray[--nItems];
    }
    // peek at minimum item
    public long peekMin(){
        return queArray[nItems-1];
    }
    // isEmpty
    public boolean isEmpty(){
        return (nItems ==0);
    }
    // isFull
    public  boolean isFull(){
        return (nItems==maxsize);
    }
}
