import java.util.Random;

public class Exercicio05 {
    public static void main(String[] args){
        Random random = new Random();
        int[] vetor = new int[10], vetorModificado = new int[10];
        int randomNumber;

        for (int i = 0; i<vetor.length;  i++){
            randomNumber = random.nextInt(201) - 100;
            vetor[i] = randomNumber;
        }

        for (int i = 0; i<vetor.length;  i++){            
            if (vetor[i] > 0) {
                vetorModificado[i] = vetor[i];
            }
        }

        System.out.print("Vetor original --> | ");
        for (int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " | ");
        }

        System.out.print("\n\nVetor compactado --> | ");
        for (int i = 0; i < vetorModificado.length; i++){
            if (vetor[i] > 0) {
                System.out.print(vetorModificado[i] + " | ");
            }
        }
    }
}
