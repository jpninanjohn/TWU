import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Ninan John J P on 6/23/2016.
 */
public class PrimeFactors {

    ArrayList factorArray= new ArrayList();
    int number;

    public PrimeFactors(int number) {

        this.number= number;

    }

    public void generate(){

        for(int i=2;i<number/2;i++){

            if(number%i==0)
                if(checkPrime(i))
                    factorArray.add(i);

        }


    }

    private boolean checkPrime(int factor) {

        for(int i=2;i<factor/2;i++){

            if(factor%i==0)
                return false;

        }

        return true;
    }

    public static void main(String... a){

        Scanner in= new Scanner(System.in);
        System.out.print("Enter Integer:");
        int number= in.nextInt();
        in.nextLine();

        PrimeFactors factors= new PrimeFactors(number);
        factors.generate();
        System.out.println("The Factors of the Number:"+factors.factorArray);


    }

}
