import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int age;
        
        System.out.print("Informe a idade do nadador:\n--> ");
        age = scan.nextInt();

        if (age <= 7){
            System.out.println("INFANTIL");
        }
        else if (age <= 10){
            System.out.println("JUVENIL");
        }
        else if (age <= 15){
            System.out.println("ADOLESCENTE");
        }
        else if (age <= 30){
            System.out.println("ADULTO");
        }
        else{
            System.out.println("SENIOR");
        }

        scan.close();
    }
}
