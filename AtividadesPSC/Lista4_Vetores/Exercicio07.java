import java.util.Random;

public class Exercicio07 {
    public static void main(String[] args){
        Random random = new Random();
        int[] vetor = new int[15], vetorPrime = new int[15];
        int randomNumber;
        boolean isPrime = true;

        for (int i = 0; i<vetor.length;  i++){
            randomNumber = random.nextInt(201) - 100;
            vetor[i] = randomNumber;
        }

        for (int i = 0; i<vetor.length;  i++){            
            if (vetor[i] <= 1) {
                isPrime = false;
            } else if (vetor[i] == 2) {
                isPrime = true;
            } else if (vetor[i] % 2 == 0) {
                isPrime = false;
            } else {
                for (int x = 3; i <= Math.sqrt(vetor[x]); x += 2) {
                    if (vetor[x] % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                vetorPrime[i] = vetor[i];
        }
    }
        System.out.print("Vetor Normal --> | ");
        for (int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " | ");
        }

        System.out.print("\n\nVetor de primos --> | ");
        for (int i = 0; i < vetorPrime.length; i++){
            if (vetor[i] > 0) {
                System.out.print(vetorPrime[i] + " | ");
            }
        }
    }   
}

