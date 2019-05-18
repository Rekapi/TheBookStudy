package DerekBanasVid;
/**
 * This tutorial covering the following points :
 * 1. how to make an array 
 * 2. how to display it on screen 
 * 3. how to delet item by its index 
 * 4. how to insert item into Array
 * 5. how to make linear search
 */
public class Algorithms {
    private  int[] theArray = new int[50];
    private int arraySize = 10;

    public void generatRandomArray(){
        for(int i =0;i<arraySize;i++){
        	// you can change the array 
            theArray[i] = (int)(Math.random()*10)+10;
        }
    }

    public void printArray(){
        System.out.println("-------------");
        for(int i=0;i<arraySize;i++){
            System.out.print("|  "+i + "   |   ");
            
            System.out.println(theArray[i] + "   |  ");
            
            System.out.println("-------------");
        }
    }
    
    // getting item by its index 
    public int getValueAtIndex(int index) {
    	if(index < arraySize) return theArray[index];
    	return 0;
    }
    
    // checking for an item 
    public boolean doesArrayContainThisValue(int searchValue) {
    	boolean valueInArray = false;
    	for(int i=0;i<arraySize;i++) {
    		if(theArray[i] == searchValue) { // if the item is inside the array return true otherwise return false 
    			valueInArray = true;
    		}
    	}
    	return valueInArray;
    }
    
    // Deleting 
    public void deleteIndex(int index) {
    	if(index < arraySize) {
    		for(int i =index;i<(arraySize-1);i++) {
    			theArray[i] = theArray[i+1];
    		}
    		arraySize--;
    	}
    }
    
    // Inserting 
    public void Insert(int value) {
    	if(arraySize < 50) {
    		theArray[arraySize] = value;
    		arraySize++;
    	}
    }
    
    // Linear search 
    public String linearSearchForValue(int value) {
    	boolean valueInArray =false ;
    	String indexsWithValue ="";
    	
    	System.out.println("");
    	for(int i=0;i<arraySize;i++) {
    		if(theArray[i] == value) {
    			valueInArray = true;
    			System.out.println(i + "  ");
    			indexsWithValue+=i + " ";
    		}
    	}
    	if(!valueInArray) {
    		indexsWithValue = "None";
    		System.out.println(indexsWithValue);
    	}
    	System.out.println();
    	return indexsWithValue;
    }
    public static void main(String[] args) {
        
        Algorithms arr = new Algorithms();
        arr.generatRandomArray();
        arr.printArray();
        System.out.println(arr.getValueAtIndex(5));  
        System.out.println(arr.doesArrayContainThisValue(15));
        arr.deleteIndex(4); // deleting the number with index 4
        arr.printArray();
        arr.Insert(85);
        arr.printArray();
        arr.linearSearchForValue(15);
    }
}
