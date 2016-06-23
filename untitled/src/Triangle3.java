import java.util.Scanner;

/**
 * Created by Ninan John J P on 6/23/2016.
 */
public class Triangle3 {

    public static void main(String... a){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Value of 'n':");
        int n= in.nextInt();
        in.nextLine();

        for(int i=0;i<n;i++)
            System.out.println("*");

    }

}
