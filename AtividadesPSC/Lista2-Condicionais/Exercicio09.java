import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int age;
        
        System.out.print("Informe sua idade:\n--> ");
        age = scan.nextInt();

        if (age < 16){
            System.out.print("Não Eleitor.");
        }
        else if (age < 18 || age > 65){
            System.out.print("Eleitor Facultativo.");
        }
        else{
            System.out.print("Eleitor Obrigatório.");
        }

        scan.close();
    }
}
