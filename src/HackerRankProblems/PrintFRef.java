package HackerRankProblems;

public class PrintFRef {
    public static void main(String[] args) {
        System.out.println("Summary of printf format specifiers .....");
        for(int n =0; n< 40; n++)
            System.out.print("-");
        System.out.println("");
        System.out.println("%c |character  ");
        System.out.println("%d |decimal  ");
        System.out.println("%e |exponential floating-point number  ");
        System.out.println("%f |floating-point number  ");
        System.out.println("%i |integer  ");
        System.out.println("%% |percent sign  ");
        System.out.println("/% |print percent sign  ");
        System.out.println("Left-justifying printf integer out put .....");
        for(int n =0; n< 40; n++)
            System.out.print("-");
        System.out.println("");
        System.out.println("The %3d specifier means a minimum width of three spaces will be right-justified  ");
        System.out.println("%3d,0 | 0  ");
        System.out.println("The %-3d specifier means a minimum width of three spaces will be left-justified  ");
        System.out.println("The printf integer zero-fill option .....");
        for(int n =0; n< 40; n++)
            System.out.print("-");
        System.out.println("");
        System.out.println("%03d,0 | 000  ");
        System.out.println("%03d,1 | 001  ");
        System.out.println("printf string formatting .........");
        for(int n =0; n< 40; n++)
            System.out.print("-");
        System.out.println("");
        System.out.println("%s, Hello | simple string");
        System.out.println("%10s, Hello | 10 spaces before the word (right justify)");
        System.out.println("%-10s, Hello | 10 spaces after the word (left justify");
        for(int n =0; n< 61; n++)
            System.out.print("-");
        System.out.println("");
        System.out.println();
        System.out.println("Example ");
        for(int n =0; n< 61; n++)
            System.out.print("-");
        System.out.println("");
        for(int i =0; i<10;i++)
            System.out.format("| %2s "+ " ", i);
        System.out.println("|");
        for(int n =0; n< 61; n++)
            System.out.print("-");
        System.out.println("");
    }
}
