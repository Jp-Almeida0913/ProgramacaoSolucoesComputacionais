import java.util.Random;

public class Exercicio15 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        int randomNumber;

        System.out.println("Digite 30 números inteiros:");
        for (int i = 0; i < array.length; i++) {
            randomNumber = random.nextInt(201) - 100;
            array[i] = randomNumber;
        }


        System.out.print("Vetor Original --> | ");
        for (int i =0 ; i < array.length ; i ++) {
            System.out.print(array[i] + " | ");
        }

        System.out.print("\n\nVetor Modificado:\n");
        for (int i =0 ; i < array.length ; i ++) {
            if (array[i] < 0){
                array[i] = 0;
            }
            System.out.print(array[i] + " | ");
        }
    }
}