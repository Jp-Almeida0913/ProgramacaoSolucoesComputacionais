import java.util.Random;
import java.util.ArrayList;

public class Exercicio09 {

    public static void main(String[] args) {
        int[] vetor1 = new int[10], vetor2 = new int[10];

        preencherVetorAleatoriamente(vetor1, 1, 20);
        preencherVetorAleatoriamente(vetor2, 1, 20);

        System.out.print("Vetor 1 --> ");
        mostrarVetor(vetor1);

        System.out.print("Vetor 2 --> ");
        mostrarVetor(vetor2);

        System.out.print("Vetor unido --> ");
        uniaoVetores(vetor1, vetor2);
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

    public static void uniaoVetores(int[] v1, int[] v2) {
        ArrayList<Integer> uniao = new ArrayList<>();

        for (int num : v1) {
            if (!uniao.contains(num)) {
                uniao.add(num);
            }
        }

        for (int num : v2) {
            if (!uniao.contains(num)) {
                uniao.add(num);
            }
        }

        for (int num : uniao) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}