import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        System.out.print("Insira um valor para retornar a tabuada do mesmo --> ");
        number = scan.nextInt();
        mostrarTabela(number);
        scan.close();
    }

    public static void mostrarTabela(int n) {
        if (n < 1 || n > 9) {
            System.out.println("Número fora do intervalo (1 a 9).");
            return;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf("%2d x %2d = %2d  ", i, j, i * j);
            }
            System.out.println();
    }
}
}

