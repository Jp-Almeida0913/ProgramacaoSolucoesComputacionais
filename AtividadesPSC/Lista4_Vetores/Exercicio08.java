import java.util.Random;

public class Exercicio08 {
    public static void main(String[] args){
        Random random = new Random();
        float[] vetor = new float[15], vetorDividido = new float[15];
        float randomNumber, maxNumber;
        int  i = 1;

        randomNumber = random.nextFloat(100);
        vetor[0] = randomNumber;
        maxNumber = randomNumber;

        while (i < vetor.length){
            randomNumber = random.nextFloat(100);
            vetor[i] = randomNumber;
            if (vetor[i] > maxNumber){
                maxNumber = vetor[i];
            }
            i += 1;
        }

        for(int x = 0 ; x < vetorDividido.length; x++){
            vetorDividido[x] = vetor[x]/maxNumber;
        }

        System.out.print("Vetor Normal --> | ");
        for (int x = 0; x < vetor.length; x++){
            System.out.print(vetor[x] + " | ");
        }

        System.out.print("\n\nMaior valor dentro do vetor --> " + maxNumber + "\n");

        System.out.print("\nVetor dividido pelo maior número dentro do vetor --> | ");
        for (int x = 0; x < vetorDividido.length; x++){
            System.out.print(vetorDividido[x] + " | ");
        }
    }
}
