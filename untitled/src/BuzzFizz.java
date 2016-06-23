/**
 * Created by Ninan John J P on 6/23/2016.
 */
public class BuzzFizz {

    public static boolean checkDivisibility(int num){

        if(num%5==0||num%3==0){

            if(num%5==0&&num%3==0)
                System.out.println("FizzBuzz");

            else if(num%3==0)
                System.out.println("Fizz");

            else if(num%5==0)
                System.out.println("Buzz");

            return true;

        }

        return false;

    }

    public static void main(String... a){

        for(int i=1;i<=100;i++){

            if(checkDivisibility(i))
                continue;
            else
                System.out.println(i);

        }

    }

}
