package Chapter05;

/**
 * Chapter 05 - Linked List
 * Listing 5.1
 */
public class Link {
    public int iData; // data item (key)
    public double dData; // data item
    public Link next; // next link in list
    // constructor

    public Link(int id, double dd) {
        iData = id;
        dData = dd;
    }

    // display
    public void displayLink() {
        System.out.println("{" + iData + "," + dData + "}");
    }
}

class LinkList {
    private Link first; // ref to first link on list
    // constructor

    public LinkList() {
        first = null; // no item on list yet
    }

    // check if the list is empty
    public boolean isEmpty() {
        return (first == null);
    }

    // inserting at start of the list method
    public void insertFirst(int id, double dd) {
        Link newLink = new Link(id, dd);
        newLink.next = first;
        first = newLink;
    }

    public Link deleteFirst() {
        Link temp = first;
        first = first.next;
        return temp;
    }

    public void displayList() {
        System.out.println("List (first --> last) :");
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
}

class LinkListApp {
    public static void main(String[] args) {
        LinkList theList = new LinkList();  // creating new linked list
        theList.insertFirst(22,2.99);  // adding elements
        theList.insertFirst(44,4.99);
        theList.insertFirst(66,6.99);
        theList.insertFirst(88,8.99);
        theList.displayList(); // display
        while(!theList.isEmpty()){ // until it's empty
            Link aLink = theList.deleteFirst();
            System.out.println("Deleted "); // delete
            aLink.displayLink();
            System.out.println("");
        }
        theList.displayList();
    }
}
