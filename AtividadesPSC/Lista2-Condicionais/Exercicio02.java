import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double firstGrade, secondGrade, avarege;

        System.out.print("Insira a primeira nota:\n--> ");
        firstGrade = scan.nextDouble();

        System.out.print("Insira a segunda nota:\n--> ");
        secondGrade = scan.nextDouble();

        avarege = (firstGrade+secondGrade)/2;

        if (avarege >= 7){
            System.out.printf("Média: %.2f\nSituação: Aprovado", avarege);
        }
        else{
            System.out.printf("Média: %.2f\nSituação: Reprovado", avarege);
        }

        scan.close();
    }
}
