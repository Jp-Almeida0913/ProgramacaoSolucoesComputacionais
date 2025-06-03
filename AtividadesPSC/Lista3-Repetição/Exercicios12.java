import java.util.Scanner;

public class Exercicios12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variáveis de controle
        int idade, contador = 0, quantidadeMulheres = 0, maiorIdade = Integer.MIN_VALUE, menorIdade = Integer.MAX_VALUE, idadeMenorSalario = 0;
        double salario, somaSalarios = 0, menorSalario = Double.MAX_VALUE;
        String sexo, sexoMenorSalario = "";

        while (true) {
            System.out.print("Digite a idade (valor negativo para encerrar) --> ");
            idade = scanner.nextInt();

            if (idade < 0) {
                break;
            }

            System.out.print("Digite o sexo (M/F/I)--> ");
            sexo = scanner.next();

            System.out.print("Digite o salário-->");
            salario = scanner.nextDouble();

            somaSalarios += salario;
            contador++;

            if (idade > maiorIdade) {
                maiorIdade = idade;
            }
            if (idade < menorIdade) {
                menorIdade = idade;
            }
            if (sexo.equalsIgnoreCase("F")) {
                quantidadeMulheres++;
            }
            if (salario < menorSalario) {
                menorSalario = salario;
                idadeMenorSalario = idade;
                sexoMenorSalario = sexo;
            }

            System.out.println();
        }

        if (contador > 0) {
            double mediaSalarios = somaSalarios / contador;

            System.out.println("\n\nResultados da Pesquisa\n\n"+
            "Média dos salários: " + mediaSalarios + 
            "\nMaior idade: " + maiorIdade
            + "\nMenor idade: " + menorIdade
            + "\nQuantidade de mulheres:" + quantidadeMulheres
            +"\nMenor salário: " + menorSalario
            +"\nIdade da pessoa com menor salário: " + idadeMenorSalario
            +"\nSexo da pessoa com menor salário: " + sexoMenorSalario);

        } else {
            System.out.println("Nenhum dado foi inserido.");
        }

        scanner.close();
    }
}
