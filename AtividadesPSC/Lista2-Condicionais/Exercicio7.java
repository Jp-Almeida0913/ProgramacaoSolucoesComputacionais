import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double salary;

        System.out.print("Informe o seu sálario --> ");
        salary = scan.nextDouble();

        if (salary < 1000.00){
            salary = salary * 1.3;
            System.out.printf("\n\nSugeito a aumento de sálario.\nSalário pós reajuste --> R$%.2f", salary);
        }else{
            System.out.print("\n\nNão aplicável a reajuste");
        }

        scan.close();
    }
}
