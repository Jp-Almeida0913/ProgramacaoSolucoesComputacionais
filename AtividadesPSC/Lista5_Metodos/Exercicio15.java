import java.util.Random;

public class Exercicio15 {

    public static void main(String[] args) {
        Random rand = new Random();

        while (true) {
            int x = rand.nextInt(100) + 1;
            int y = rand.nextInt(100) + 1;

            if (x == y) {
                System.out.println("Par --> x = " + x + ", y = " + y);
                System.out.println("Encerrando o programa porque x == y.");
                break;
            }

            if (x > y) {
                int temp = x;
                x = y;
                y = temp;
            }

            int soma = somaPrimosEntre(x, y);

            System.out.println("\nPar  -->  x = " + x + ", y = " + y + "\nsoma dos primos --> " + soma);
        }
    }

    public static int somaPrimosEntre(int x, int y) {
        int soma = 0;
        for (int num = x; num <= y; num++) {
            if (ehPrimo(num)) {
                soma += num;
            }
        }
        return soma;
    }

    public static boolean ehPrimo(int n) {
        if (n < 2) return false;

        int limite = (int) Math.sqrt(n);
        for (int i = 2; i <= limite; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}