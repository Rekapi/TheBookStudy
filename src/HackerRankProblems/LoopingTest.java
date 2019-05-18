package HackerRankProblems;

import java.util.Scanner;

public class LoopingTest {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        for(int i = 1; i<=10;i++){
            int result = n * i;
            System.out.println(n + " x " + i + " = " + result);
        }
        System.out.println(" ");
        int t = scanner.nextInt();
        for(int i=0;i<t;i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int m = scanner.nextInt();
            int r = a;
            for(int j =0;j<m;j++){
                r = r + ((int) Math.pow(2,j)*b);
                System.out.printf(r +"\t");
            }
        }
        System.out.println(" ");
    }
}
