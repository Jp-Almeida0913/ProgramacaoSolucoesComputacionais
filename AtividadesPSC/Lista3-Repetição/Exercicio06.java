import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int number = 0, count = 0, average = 0 ;
        double result;

        System.out.print("Insira um número (Fecha ao digitar 0): ");
        number = scan.nextInt();

        while (number != 0){
            if (number%2 == 0){
                average += number;
                count += 1;
            }
            System.out.print("Insira outro número (Fecha ao digitar 0): ");
            number = scan.nextInt();
        }

        result = average/count;
        System.out.print("0 digitado, finalizando código...\nMédia dos número pares digitados --> " + result);
        scan.close();
    }
}