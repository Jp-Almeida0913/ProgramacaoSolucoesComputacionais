import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int day;

        System.out.print("Informe um número para saber o dia da semana:\n--> ");
        day = scan.nextInt();

        switch(day){
            case 1:
                System.out.print("Domingo");
                break;

            case 2:
                System.out.print("Segunda-Feira");
                break;

            case 3:
                System.out.print("Terça-Feira");
                break;

            case 4:
                System.out.print("Quarta-Feira");
                break;

            case 5:
                System.out.print("Quinta-Feira");
                break;

            case 6:
                System.out.print("Sexta-Feira");
                break;

            case 7:
                System.out.print("Sábado");
                break;

            default:
                System.out.print("Opção inválida!");
                break;
        }

        scan.close();
    }
}
