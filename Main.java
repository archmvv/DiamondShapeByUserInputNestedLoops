import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i, j, k;

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number for the diamond shape: ");
        int input = in.nextInt();

        for(i=1;i<=input;i++)
        {
            for (j=input;j>i;j--)
            {
                System.out.print(" ");
            }
            for (k=1;k<=(2*i -1);k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=input-1;i>=1;i--)
        {
            for (j=input;j>i;j--)
            {
                System.out.print(" ");
            }
            for (k=1;k<=(2*i -1);k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}