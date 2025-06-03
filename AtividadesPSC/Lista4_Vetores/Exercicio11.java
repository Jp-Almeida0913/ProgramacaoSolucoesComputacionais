import java.util.Random;

public class Exercicio11 {
    public static void main(String[] args){
        Random random = new Random();
        int[] vetor = new int[15];
        int randomNumber, avarage = 0;

        for(int i = 0; i<vetor.length; i++){
            randomNumber = random.nextInt(100);
            vetor[i] = randomNumber;
            avarage = avarage += vetor[i];
        }

        System.out.print("Vetor --> | ");
        for (int i = 0; i < vetor.length ; i++){
            System.out.print(vetor[i] + " | ");
        }

        avarage = avarage/vetor.length;
        System.out.print("\n\nMédia dos números do vetor --> " + avarage);

        System.out.print("\n\nNúmeros do presente no vetor a baixo da méida --> | ");
        for (int i = 0; i < vetor.length ; i++){
            if (vetor[i] < avarage){
                System.out.print(vetor[i] + " | ");
            }
        }
    }
}
