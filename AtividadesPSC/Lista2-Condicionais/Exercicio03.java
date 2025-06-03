import java.util.Scanner;


public class Exercicio03 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double firstGrade, secondGrade, thirdGrade, avarege;

        System.out.print("Insira a primeira nota:\n--> ");
        firstGrade = scan.nextDouble();

        System.out.print("Insira a segunda nota:\n--> ");
        secondGrade = scan.nextDouble();

        System.out.print("Insira a terceira nota:\n--> ");
        thirdGrade = scan.nextDouble();

        avarege = (firstGrade + secondGrade + thirdGrade)/3;

        if(avarege >= 0 && avarege < 3){
            System.out.printf("Média final: %.2f\nSituação: Reprovado", avarege);
        }
        else if (avarege < 7){
            System.out.printf("Média final: %.2f\nSituação: Exame", avarege);
        }
        else if (avarege <= 10){
            System.out.printf("Média final: %.2f\nSituação: Aprovado", avarege);
        }
        else{
            System.out.printf("Inválido!");
        }

    scan.close();
    }
}
