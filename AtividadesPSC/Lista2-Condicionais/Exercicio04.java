import java.util.Scanner;


public class Exercicio04 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double sideA, sideB, sideC;

        System.out.print("Informe os lados do póssivel triangulo:\nLado A --> ");
        sideA = scan.nextDouble();
        
        System.out.print("Lado B --> ");
        sideB = scan.nextDouble();

        System.out.print("Lado C --> ");
        sideC = scan.nextDouble();

        if ((sideA + sideB) > sideC && (sideA + sideC) > sideB && (sideB + sideC) > sideA){
            System.out.print("É possível formar um triângulo");
        }
        else{
            System.out.print("Não é possível formar um triângulo");
        }

        scan.close();
    }
}
