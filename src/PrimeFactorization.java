import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args){
        Scanner user = new Scanner(System.in);
        System.out.println("Enter a value:");
        int value = user.nextInt();

        primeFactors(value);
    }

    public static void primeFactors(int value){
        while(value % 2 == 0){
            System.out.print(2 + " ");
            value /= 2;
        }

        for(int i = 3; i <= Math.sqrt(value); i += 2){
            while(value % i == 0){
                System.out.print(i + " ");
                value /= i;
            }
        }

        if(value > 2)
            System.out.println(value);
    }
}
