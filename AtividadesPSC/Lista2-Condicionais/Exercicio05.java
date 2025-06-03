import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sex;
        double height, idealWeight;

        System.out.print("Informe sua altura:\n--> ");
        height = scan.nextDouble();

        System.out.print("\n\nSelecione a opção correspondente ao seu sexo:\n1) Masculino\n2) Feminino\n\n--> ");
        sex = scan.nextInt();

        switch (sex) {
            case 1:
                idealWeight = (72.7 * height) - 58.0;
                System.out.printf("Peso ideal --> %.2f kg%n", idealWeight);
                break;

            case 2:
                idealWeight = (62.1 * height) - 44.7;
                System.out.printf("Peso ideal --> %.2f kg%n", idealWeight);
                break;

            default:
                System.out.println("Opção inválida!");
                break;
        }

        scan.close();
    }
}