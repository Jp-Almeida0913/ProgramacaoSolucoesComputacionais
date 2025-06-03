import java.util.Scanner;

public class ExercicioExtra {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double a, b, c, delta, result1, result2;

        System.out.print("aX² + bX + c = 0\n\nInforme o valores de a, b e c:\na --> ");
        a = scan.nextDouble();
        System.out.print("b --> ");
        b = scan.nextDouble();
        System.out.print("c --> ");
        c = scan.nextDouble();

        delta = Math.pow(b, 2) - 4*(a * c);

        if (delta< 0){
            System.out.printf("Delta --> %.2f\nNão existe raiz real", delta);
        }
        else if (delta == 0){
            result1 = (-b)/(2*a);
            System.out.printf("Delta --> %.2f\nExiste somente uma raiz real\nResultado --> %.2f", delta, result1);
        }
        else{
            result1 = (-b + Math.sqrt(delta)) / (2*a);
            result2 = (-b - Math.sqrt(delta)) / (2*a);
            System.out.printf("Delta --> %.2f\nExistem duas raízes reais\nResultado 1 --> %.2f\nResultado 2 --> %.2f", delta, result1, result2);
        }
        scan.close();
    }
}