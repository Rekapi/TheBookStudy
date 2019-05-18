package HackerRankProblems;
import java.util.*;
class CompareTheTrip {

    public static final int SIZE =3;
    public static void main(String[] args) {

        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        System.out.println("Please insert the first array items :");
        int[] Alice =new int[SIZE];
        
        
        int[] Bob =new int [SIZE];

        for(int i=0;i<SIZE;i++){
            Alice[i] = scan.nextInt();
        }
        System.out.println("The Second array :");

        for(int i=0;i<SIZE;i++){
            Bob[i] = scan.nextInt();
        }
        int k = 0;
        int j = 0;
        // 2. compare Alice array.indexes with each others
        for (int i = 0; i < Alice.length; i++) {
            if (Alice[i] > Bob[i]) {
                k++;
            } else if (Alice[i] < Bob[i]) {
                j++;
            }
        }
        System.out.println("[" + k + " " + j + "]");
        
    }
}