import java.util.Random;

public class Exercicio04 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] vetorOriginal = new int[30], vetorModificado = new int[30];
        int randomNumber;

        for (int i = 0; i < 30; i++) {
            randomNumber = random.nextInt(5);
            vetorOriginal[i] = randomNumber;
        }

        for (int i = 0; i < 30; i++) {
            if (vetorOriginal[i] == 0) {
                vetorModificado[i] = 1;
            } else {
                vetorModificado[i] = vetorOriginal[i];
            }
        }

        System.out.print("Vetor Original:\n");
        for (int valor : vetorOriginal) {
            System.out.print(valor + " ");
        }

        System.out.print("\nVetor Modificado:\n");
        for (int valor : vetorModificado) {
            System.out.print(valor + " ");
        }
    }
}