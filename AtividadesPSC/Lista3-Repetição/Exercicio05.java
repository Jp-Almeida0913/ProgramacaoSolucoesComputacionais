import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        int flag = 0;
        Scanner scan = new Scanner(System.in);

        while(flag != 4){
            System.out.print("Qual combustível desejado?\n1)Alcool\n2)Gasolina\n3)Diesel\n4)Sair\n--> ");
            flag = scan.nextInt();

            switch (flag){
                case 1:
                    System.out.println("Álcool Selecionado!");
                    break;
                case 2: 
                    System.out.println("Gasolina Selecionado!");
                    break;
                case 3:
                    System.out.println("Diesel Selecionado!");
                    break;
                case 4:
                    System.out.print("Saindo!");
                    break;
                default:
                    System.out.println("Opção invláida");
                    break;
            }
        }
    
    scan.close();
    }
}
