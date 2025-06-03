import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int numberOne, numberTwo;
        Exercicio02 obj = new Exercicio02();
        System.out.print("Informe o valor para o primeiro número --> ");
        numberOne = scan.nextInt();
        System.out.print("Informe o valor para o segundo número --> ");
        numberTwo = scan.nextInt();

        System.out.print("A soma dos números inteiro entre " + numberOne + " e " + numberTwo + " é " + obj.divisaoDosNumerosEntreAeB(numberOne, numberTwo));
        scan.close();

}
    public int divisaoDosNumerosEntreAeB(int a, int b){
        int result = 0, entre;
        if (a < b){
            entre = a + 1;
            while (entre < b){
                result += entre;
                entre +=1;
            }
        } else {
            entre = b+1;
            while (entre < a ){
                result +=entre;
                b +=1;
            }
        }
        return result;
    }
}
