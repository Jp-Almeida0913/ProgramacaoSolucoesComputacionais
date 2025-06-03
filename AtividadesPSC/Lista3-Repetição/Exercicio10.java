import java.util.Scanner;

public class Exercicio10 {
        public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int answer;

        System.out.print("Pense em número de 1 a 8.\n\n"
        + "Agora responda as perguntas:\n O número está entre 1 e 4?"
        +"\n1)Sim\n2)Não\n--> ");
        answer = scan.nextInt();

        if (answer == 1){
            System.out.print("O número está entre 1 e 2?\n1)Sim\n2)Não\n--> ");
            answer = scan.nextInt();

            if (answer == 1){
                System.out.print("é o número 1?\n1)Sim\n2)Não\n--> ");
                answer = scan.nextInt();

                if (answer == 2){
                    System.out.println("Então é o número 2!");
                }
            }else{
                System.out.println("é o número 3?\n1)Sim\n2)Não\n--> ");
                answer = scan.nextInt();

                if (answer == 2){
                    System.out.println("Então é o número 4!");
                }
            }
        }else{
            System.out.println("O número está entre 5 e 6?\n1)Sim\n2)Não\n--> ");
            answer = scan.nextInt();
            if (answer == 1){
                System.out.println("é o número 5?\n1)Sim\n2)Não\n--> ");
                answer = scan.nextInt();

                if (answer == 2){
                    System.out.println("Então é o número 6!");
                }
            }else{
                System.out.println("é o número 7?\n1)Sim\n2)Não\n--> ");
                answer = scan.nextInt();

                if (answer == 2){
                    System.out.println("Então é o número 8!");
                }
            }
        }
        scan.close();
    }
}
