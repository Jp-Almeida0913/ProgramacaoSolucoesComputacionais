import java.util.Scanner;
import java.lang.Math;


public class Exercicio07 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int number; 
        boolean isPrime = true;

        System.out.print("Digite um número inteiro --> ");
        number = scan.nextInt();

        if (number <= 1) {
            isPrime = false;
        } else if (number == 2) {
            isPrime = true;
        } else if (number % 2 == 0) {
            isPrime = false;
        } else {
            for (int i = 3; i <= Math.sqrt(number); i += 2) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " é primo!");
        } else {
            System.out.println(number + " não é primo!");
        }

        scan.close();
    }
}