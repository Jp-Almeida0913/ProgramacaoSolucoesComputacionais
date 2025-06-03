import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number, resultado;
        System.out.print("Insira um número --> ");
        number = scan.nextInt();
        resultado = calculoFatorial(number);

        System.out.println("Resultado do calculo --> " + resultado);
        scan.close();
    }

    public static int calculoFatorial(int number) {
        int s = 0, x = 0, fatorial = 0 ;
        for (int i = 1 ; i <= number; i++){
            x = 1;
            while (x <= i){
                fatorial = i * x;
                x++;
            }

            s += fatorial;
        }

        return s;
    }
}