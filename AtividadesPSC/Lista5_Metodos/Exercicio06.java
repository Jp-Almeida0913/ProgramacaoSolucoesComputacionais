import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char choice;
        double primeiraNota, segundaNota,  terceiraNota; 

        
        System.out.print("Insira a primeira nota --> ");
        primeiraNota = scan.nextDouble();
        
        System.out.print("Insira a segunda nota --> ");
        segundaNota = scan.nextDouble();
        
        System.out.print("Insira a terceira nota --> ");
        terceiraNota = scan.nextDouble();
        
        System.out.print("Digite 'A' para média aritmética ou 'P' para média ponderada --> ");
        choice = scan.next().toUpperCase().charAt(0);
        
        double media = notaAluno(primeiraNota, segundaNota, terceiraNota, choice);
        System.out.printf("A média calculada foi: %.2f%n", media);
        
        scan.close();
    }

    public static double notaAluno(double a, double b, double c, char tipo) {
        if (tipo == 'A') {
            return (a + b + c) / 3.0;
        } else if (tipo == 'P') {
            return (a * 5 + b * 3 + c * 2) / 10.0;
        } else {
            System.out.println("Tipo inválido. Retornando média 0.");
            return 0;
        }
    }
}
