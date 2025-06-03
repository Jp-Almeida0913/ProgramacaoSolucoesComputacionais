import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double firstNumber, secondNumber;

        System.out.print("Insira o primeiro número:\n--> ");
        firstNumber = scan.nextDouble();

        System.out.print("Insira o segundo número:\n--> ");
        secondNumber = scan.nextDouble();

        if (firstNumber == secondNumber) {
            System.out.println("Ambos são o mesmo número.");
        } else if (firstNumber > secondNumber) {
            System.out.printf("%.2f é maior que %.2f%n", firstNumber, secondNumber);
        } else {
            System.out.printf("%.2f é maior que %.2f%n", secondNumber, firstNumber);
        }

        scan.close();
    }
}
