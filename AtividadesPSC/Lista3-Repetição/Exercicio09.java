import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int number, sum = 0;

        System.out.print("Insira um número --> ");
        number = scan.nextInt();

        for(int count = 2; count < number; count++){
            if (number%count == 0){
                sum += count;
            }
        }

        System.out.println("A soma dos números entre 2 e " + number + " é ---> " + sum);
        scan.close();
    }
}