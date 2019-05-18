package Chapter02;

// original class 
class HighArrayApp{
    public static void main(String[] args) {
        int maxSize= 100; // size of the array 
        HighArrayL23 arr;
        arr = new HighArrayL23(maxSize);  // creating the array 
        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

 //       arr.display(); // display items 
        // the below code not working well
	 /* 	@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in); 
        int searchKey = scan.nextInt(); // searching for an item from the user 
        System.out.println("your item is : " + searchKey);
        if(arr.find(searchKey))
        System.out.println("Found " + searchKey);
        else
        System.out.println("cant find " + searchKey);  */

        // deleting items 
        arr.delete(00); 
        arr.delete(55);
        arr.delete(99);

        arr.display();
    }
}