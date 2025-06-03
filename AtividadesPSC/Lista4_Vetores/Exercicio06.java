import java.util.Random;

public class Exercicio06 {
    public static void main(String[] args){
        Random random = new Random();
        int[] vetorA = new int[5], vetorB = new int[5], vetorC = new int[5];
        int randomNumber, somaA = 0, somaB = 4;

        for (int i = 0; i<vetorA.length;  i++){
            randomNumber = random.nextInt(100);
            vetorA[i] = randomNumber;
            randomNumber = random.nextInt(100);
            vetorB[i] = randomNumber;
        }

        for (int i = 0 ; i < vetorC.length; i++){
            vetorC[i] = vetorB[somaB] - vetorA[somaA];
            somaA +=1;
            somaB -=1;
        }


        System.out.print("Vetor A --> | ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " | ");
        }

        System.out.print("\n\nVetor B --> | ");
        for (int i = 0; i < vetorB.length; i++){
            System.out.print(vetorB[i] + " | ");
        }

        System.out.print("\n\nVetor C --> | ");
        for (int i = 0; i < vetorC.length; i++){
            System.out.print(vetorC[i] + " | ");
        }
    }
}
