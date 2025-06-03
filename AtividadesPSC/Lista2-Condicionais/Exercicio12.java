import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double firstNumber , secondNumber, calc;
        int menu;

        System.out.print("Informe um número\n--> ");
        firstNumber = scan.nextDouble();

        System.out.print("Informe outro número\n--> ");
        secondNumber = scan.nextDouble();

        System.out.print("Selecione uma opção do menu\n"+
        "1 -- Somar\n"+
        "2 -- Subtrair\n" +
        "3 -- Multiplicar\n" +
        "4 -- Dividir\n" +
        "5 -- Sair\n--> ");

        menu = scan.nextInt();

        switch (menu) {
            case 1:
                calc = firstNumber + secondNumber;
                System.out.printf("Resultado da soma --> %.2f", calc);
                break;
            
            case 2:
                calc = firstNumber - secondNumber;
                System.out.printf("Resultado da subtração --> %.2f", calc);
                break;
            
            case 3:
                calc = firstNumber * secondNumber;
                System.out.printf("Resultado da multiplicação --> %.2f", calc);
                break;
            
            case 4:
                calc = firstNumber / secondNumber;
                System.out.printf("Resultado da divisão --> %.2f", calc);
                break;

            default:
                System.out.println("Saindo");
                break;
        }

        scan.close();
    }
}