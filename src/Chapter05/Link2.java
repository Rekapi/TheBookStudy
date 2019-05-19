package Chapter05;

/**
 * Chapter 05 -Linked List
 * more operation on linked list
 */
public class Link2 {
    public int iData;
    public double dData;
    public Link2 next;
    // constructor
    public Link2(int id, double dd){
        iData = id;
        dData = dd;
    }
    public void displayLink(){
        System.out.println("{" + iData + "," + dData + "}");
    }
}
class LinkedList2{
    private Link2 first;
    public LinkedList2(){
        first = null;
    }
    public void insertFirst(int id, double dd){
        Link2 newLink = new Link2(id, dd);
        newLink.next = first;
        first = newLink;
    }
    // new method for searching (find link with given key)
    public Link2 find(int key){
        Link2 current = first;
        while (current.iData != key){ // looping until no match
            if(current.next == null) // if end of list
                return null;
            else
                current = current.next;
        }
        return current; // found it
    }
    public Link2 delete(int key){ // delete link with given key
        Link2 current = first;
        Link2 previous = first;
        while (current.iData != key){ // looping until no match
            if(current.next == null)
                return null; // not found
            else
            {
                previous = current; // go to next link
                current = current.next;
            }
        }
        if(current == first ) // if first link
            first =first.next;
        else
            previous.next = current.next;
        return current;
    }
    // display
    public void displayList(){
        System.out.println("List (First -- > Last) :" );
        Link2 current = first;
        while (current != null){
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
}
class LinkList2App{
    public static void main(String[] args) {
        LinkedList2 theList = new LinkedList2();
        theList.insertFirst(22,22.90);
        theList.insertFirst(44,44.99);
        theList.insertFirst(66,6.99);
        theList.insertFirst(88,88.99);
        theList.displayList();
        // find item
        Link2 f = theList.find(44);
        if(f!=null)
            System.out.println("Found link with key " + f.iData);
        else
            System.out.println("can't find link");
        theList.displayList();
        // deleting item
        Link2 d = theList.delete(66);
        if(d!= null)
            System.out.println("Deleted link with key " + d.iData);
        else
            System.out.println("Cant delete link ");
        theList.displayList();
    }
}
