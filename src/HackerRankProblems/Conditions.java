package HackerRankProblems;

import java.util.Scanner;

public class Conditions {
    private static final Scanner scan= new Scanner(System.in);
    public static void main(String[] args) {
        int n = scan.nextInt();
        if(n<=100){
            if(n%2 == 0){
                if(n>2 && n<5){
                    System.out.println("Not Weird");
                }else if(n>6 && n<=20){
                    System.out.println("Weird");
                }else if(n>20){
                    System.out.println("Not Weird");
                }
            }else{
                System.out.println("Weird");
            }
        }else {
            System.out.println("your number is out of range please try again later");
        }
        double a = scan.nextDouble();
        int i = scan.nextInt();
        String esc = scan.nextLine(); // this like escape character
        String s = scan.nextLine();
        System.out.println("Double " + a);
        System.out.println("Integer " + i);
        System.out.println("String " + s);
    }
}
