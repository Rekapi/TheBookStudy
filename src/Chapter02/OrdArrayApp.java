package Chapter02;

import java.util.Scanner;

class OrdArrayApp {

    public static void main(String[] args) {
        int maxSize = 100;
        OrdArrayL24 arr;
        arr=new OrdArrayL24(maxSize);

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

        // lets make some manipulation 
        System.out.print("insert your search key : ");
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        int searchKey = scan.nextInt();

        if(arr.find(searchKey) != arr.size()) // the condition means if the search key not equal to 0 
        System.out.println("Found  " + searchKey);
        else 
        System.out.println("Cant find " + searchKey);
        System.out.print("");
     //  arr.display();

        // delete 3 items 

        // another manipulation magic 
        System.out.println("whats your first deleting number :");
        int firstNum = scan.nextInt();

        if(arr.find(firstNum) != arr.size()) // this condition is always true 
        arr.delete(firstNum);
        else 
        System.out.println("Cant find " + firstNum);
        
        arr.display();
    }
}