import java.util.Scanner;

/**
 * Created by Ninan John J P on 6/23/2016.
 */
public class Diamond2 {

    private static void printTop(int lines){

        for (int i = 1; i <= lines*2-1; i+=2) {
            for (int k=0; k < ((2*lines) - i / 2); k++)
                System.out.print(" ");
            for(int j=0;j<i;j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

    private static void printBottom(int lines){

        for (int i = lines*2-3; i > 0; i-=2) {
            for (int k=0; k < ((2*lines) - i / 2); k++)
                System.out.print(" ");
            for(int j=i;j>0;j--) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

    public static void main(String... a){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Value of 'n':");
        int n= in.nextInt();
        in.nextLine();

        printTop(n);
        printBottom(n);

    }

}
