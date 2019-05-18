package HackerRankProblems;

import java.util.Scanner;

public class VBigSum {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];
       // int member = scan.nextInt();
        for(int i =0; i<size;i++){
            arr[i] = scan.nextInt();
        }
        scan.close();
        int sum = 0;
       for(int i = 0; i <size; i++){
         //  sum =sum+ arr[i];
            System.out.print("\t" + arr[i] + " ");
        }
    }
}
