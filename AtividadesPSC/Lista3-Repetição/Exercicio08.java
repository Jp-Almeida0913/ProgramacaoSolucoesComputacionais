import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int number, sum = 0;

        System.out.print("Insira um número --> ");
        number = scan.nextInt();

        for(int count = 0; count < number; count++){
            sum +=count;
        }
        System.out.println("A soma dos números entre 0 e " + number + " é ---> " + sum);
        scan.close();
    }
}