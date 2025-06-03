import java.util.Random;

public class Exercicio10 {

    public static void main(String[] args) {
        int[] vetorA = new int[10], vetorB;

        preencherVetorAleatoriamente(vetorA, 1, 10);
        System.out.print("Vetor A --> ");
        mostrarVetor(vetorA);
        vetorB = gerarFatoriais(vetorA);
        System.out.print("Vetor Fatorial -->");
        mostrarVetor(vetorB);
    }

    public static void preencherVetorAleatoriamente(int[] vetor, int minimo, int maximo) {
        Random rand = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(maximo - minimo + 1) + minimo;
        }
    }

    public static void mostrarVetor(int[] vetor) {
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] gerarFatoriais(int[] vetorA) {
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = calculoFatorial(vetorA[i]);
        }

        return vetorB;
    }

    public static int calculoFatorial(int number) {
        int fatorial = 1;
        for (int i = 2; i <= number; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}