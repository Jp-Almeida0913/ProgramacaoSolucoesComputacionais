import java.util.Random;
import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int[] array = new int[6], userArray = new int[6];
        int randomNumber, userNumber, points = 0;

        for (int i = 0; i < array.length; i++) {
            randomNumber = random.nextInt(100);
            array[i] = randomNumber;
        }
        
        System.out.print("Informe os 6 números que você jogou na mesa sena:\n" );
        for(int i = 0; i < userArray.length ; i ++){
            System.out.print(i+1 + "º número --> ");
            userNumber = scan.nextInt();
            userArray[i] = userNumber;
        }

        System.out.print("\n\nSeu números --> | ");
        for (int i = 0; i < userArray.length ; i++){
            System.out.print( userArray[i] + " | ");
            if (userArray[i] == array[i]){
                points +=1;
            }
        }

        System.out.print("\n\nNúmeros sorteados --> | ");
        for (int i = 0; i < array.length ; i++){
            System.out.print( array[i] + " | ");
        }

        System.out.print("\n\nPontuação feita --> " + points);
        scan.close();
    }
}