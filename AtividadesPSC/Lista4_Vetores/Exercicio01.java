import java.util.Random;

public class Exercicio01 {
    public static void main(String[] args){
        Random random = new Random();
        int[] vetor = new int[15];
        int randomNumber, i = 1, x = 0, maxNumber, minNumber;

        randomNumber = random.nextInt(100);
        vetor[0] = randomNumber;
        maxNumber = randomNumber;
        minNumber = randomNumber;

        while (i < vetor.length){
            randomNumber = random.nextInt(100);
            vetor[i] = randomNumber;
            if (vetor[i] > maxNumber){
                maxNumber = vetor[i];
            }
            if (vetor[i] < minNumber){
                minNumber = vetor[i];
            }
            i += 1;
        }
        System.out.print("| ");
        while ( x < vetor.length){
            System.out.print(vetor[x] + " | ");
            x += 1;
        }

        System.out.println("\nO maior número dentro da lista é " + maxNumber + " e o menor é " + minNumber);
    }
}
