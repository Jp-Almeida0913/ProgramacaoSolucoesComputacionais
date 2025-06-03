import java.util.Random;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        int randomNumber, newNumber;
        boolean findInArray= false;

        for (int i = 0; i < vetor.length; i++) {
            randomNumber = random.nextInt(100);
            vetor[i] = randomNumber;
        }

        System.out.print("Digite um número para verificar se está no vetor: ");
        newNumber = scanner.nextInt();

        System.out.print("O número " + newNumber + " foi encontrado nas posições: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == newNumber) {
                System.out.print(i + " ");
                findInArray = true;
            }
        }

        if (!findInArray) {
            System.out.println("O número " + newNumber + " não se encontra no vetor.");
        }

        scanner.close();
    }
}