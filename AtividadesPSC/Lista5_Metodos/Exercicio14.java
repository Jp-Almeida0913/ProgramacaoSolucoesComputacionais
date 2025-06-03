import java.util.Random;

public class Exercicio14 {

    public static void main(String[] args) {
        int[][] A = new int[5][5];
        Random rand = new Random();

        System.out.println("Matriz A:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = rand.nextInt(100) + 1;
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }

        int soma = somaElementosMatriz(A);
        System.out.println("\nSoma de todos os elementos da matriz --> " + soma);
    }

    public static int somaElementosMatriz(int[][] matriz) {
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }
        }
        return soma;
    }
}