import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        final int TOTAL = 5;
        char[] sexo = new char[TOTAL] , corOlhos = new char[TOTAL] , corCabelos = new char[TOTAL];
        int[] idade = new int[TOTAL];

        lerDados(sexo, corOlhos, corCabelos, idade);

        double mediaIdade = mediaIdadeOlhosCastanhosCabelosPretos(corOlhos, corCabelos, idade);
        int maiorIdade = encontrarMaiorIdade(idade);
        int qtdMulheresPerfil = contarMulheresComPerfil(sexo, corOlhos, corCabelos, idade);

        System.out.printf("\nMédia de idade (olhos castanhos e cabelos pretos): %.2f\n", mediaIdade);
        System.out.println("Maior idade entre os habitantes: " + maiorIdade);
        System.out.println("Quantidade de mulheres entre 18 e 35 anos com olhos azuis e cabelos louros: " + qtdMulheresPerfil);
    }

    public static void lerDados(char[] sexo, char[] olhos, char[] cabelos, int[] idade) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < sexo.length; i++) {
            System.out.println("Habitante " + (i + 1) + " --> ");

            System.out.print("Sexo (M/F) --> ");
            sexo[i] = scan.next().toUpperCase().charAt(0);

            System.out.print("Cor dos olhos (A - azuis / C - castanhos) --> ");
            olhos[i] = scan.next().toUpperCase().charAt(0);

            System.out.print("Cor dos cabelos (L - louros / P - pretos / C - castanhos) --> ");
            cabelos[i] = scan.next().toUpperCase().charAt(0);

            System.out.print("Idade --> ");
            idade[i] = scan.nextInt();

            System.out.println();
        }
        scan.close();
    }

    public static double mediaIdadeOlhosCastanhosCabelosPretos(char[] olhos, char[] cabelos, int[] idade) {
        int soma = 0, contador = 0;
        for (int i = 0; i < idade.length; i++) {
            if (olhos[i] == 'C' && cabelos[i] == 'P') {
                soma += idade[i];
                contador++;
            }
        }
        return (contador > 0) ? (double) soma / contador : 0;
    }

    public static int encontrarMaiorIdade(int[] idade) {
        int maior = idade[0];
        for (int i = 1; i < idade.length; i++) {
            if (idade[i] > maior) {
                maior = idade[i];
            }
        }
        return maior;
    }

    public static int contarMulheresComPerfil(char[] sexo, char[] olhos, char[] cabelos, int[] idade) {
        int contador = 0;
        for (int i = 0; i < idade.length; i++) {
            if (sexo[i] == 'F' && idade[i] >= 18 && idade[i] <= 35 &&
                olhos[i] == 'A' && cabelos[i] == 'L') {
                contador++;
            }
        }
        return contador;
    }
}