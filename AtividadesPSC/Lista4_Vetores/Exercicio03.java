import java.util.Random;

public class Exercicio03 {
    public static void main(String[] args){
        Random random = new Random();
        int[] vetor = new int[50];
        int randomNumber;

        for (int i = 0; i<vetor.length;  i++){
            randomNumber = random.nextInt(201) - 100;
            vetor[i] = randomNumber;
        }

        for (int i = 0; i<vetor.length;  i++){            
            if (vetor[i] > 0) {
            System.out.print(vetor[i] + " | ");
            }
        }
    }
}
