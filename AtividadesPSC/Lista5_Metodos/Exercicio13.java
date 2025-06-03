import java.util.Arrays;
import java.util.Random;

public class Exercicio13 {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] A = new int[10];
        int[] B = new int[10];

        System.out.print("Vetor A --> ");
        for (int i = 0; i < A.length; i++) {
            A[i] = rand.nextInt(100) + 1;
            System.out.print(A[i] + " ");
        }

        System.out.print("\nVetor B --> ");
        for (int i = 0; i < B.length; i++) {
            B[i] = rand.nextInt(100) + 1;
            System.out.print(B[i] + " ");
        }

        int[] C = vetorOrdenadaDecrescente(A, B);

        System.out.print("\nVetor organizado --> ");
        for (int valor : C) {
            System.out.print(valor + " ");
        }
    }

    public static int[] vetorOrdenadaDecrescente(int[] A, int[] B) {
        int[] C = new int[A.length + B.length];

        for (int i = 0; i < A.length; i++) {
            C[i] = A[i];
        }

        for (int i = 0; i < B.length; i++) {
            C[i + A.length] = B[i];
        }

        Arrays.sort(C);
        for (int i = 0; i < C.length / 2; i++) {
            int temp = C[i];
            C[i] = C[C.length - 1 - i];
            C[C.length - 1 - i] = temp;
        }

        return C;
    }
}