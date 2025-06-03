public class Exercicio11 {

    public static void main(String[] args) {
        int[] perfeitos = numerosPerfeitos();

        System.out.print("Os três primeiros números perfeitos são --> ");
        for (int num : perfeitos) {
            System.out.print(num + " ");
        }
    }

    public static int[] numerosPerfeitos() {
        int[] perfeitos = new int[3];
        int contador = 0;
        int numero = 2;

        while (contador < 3) {
            if (validar(numero)) {
                perfeitos[contador] = numero;
                contador++;
            }
            numero++;
        }

        return perfeitos;
    }

    public static boolean validar(int n) {
        int soma = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                soma += i;
            }
        }

        return soma == n;
    }
}