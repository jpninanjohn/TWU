import java.util.Scanner;

/**
 * Created by Ninan John J P on 6/23/2016.
 */
public class Diamond1 {

    public static void main(String... a){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Value of 'n':");
        int n= in.nextInt();
        in.nextLine();

        for (int i = 1; i <= n; i+=2) {
            for (int k=0; k < (4 - i / 2); k++)
                System.out.print(" ");
            for(int j=0;j<i;j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
