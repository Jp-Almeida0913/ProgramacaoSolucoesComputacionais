import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double originalPrice, newPrice;
        Exercicio04 obj = new Exercicio04();
        System.out.print("Informe o valor original do produto --> ");
        originalPrice = scan.nextDouble();
        System.out.print("Informe o novo valor do produto --> ");
        newPrice = scan.nextDouble();
        obj.calculoPorcentagemDiferença(originalPrice, newPrice);
        scan.close();

}
    public void calculoPorcentagemDiferença(double originalPrice, double newPrice){
        double result; 
        result = newPrice - originalPrice;  
        result = result/originalPrice;
        result = result*100;

        System.out.println("O porcentagem de diferença entre o valor original e novo valor é de " + result + "%.");
    }
}