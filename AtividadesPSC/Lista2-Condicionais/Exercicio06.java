import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double height, weight, bmi;

        System.out.print("Informe seu peso:\n--> ");
        weight = scan.nextDouble();

        System.out.print("Informe sua altura:\n--> ");
        height = scan.nextDouble();

        bmi = weight / Math.pow(height, 2);

        if(bmi < 20){
            System.out.printf("IMC = %.2f\nSituação --> Abaixo do peso", bmi);
        }
        else if (bmi < 25){
            System.out.printf("IMC = %.2f\nSituação --> Peso normal", bmi);
        }
        else if (bmi < 30 ){
            System.out.printf("IMC = %.2f\nSituação --> Sobre peso", bmi);
        }
        else if (bmi < 40){
            System.out.printf("IMC = %.2f\nSituação --> Obeso", bmi);
        }
        else{
            System.out.printf("IMC = %.2f\nSituação --> Obeso mórbido", bmi);
        }

        scan.close();
    }
}
