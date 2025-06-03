import java.util.Random;

public class Exercicio10 {
    public static void main(String[] args){
        Random random = new Random();
        int[] vetor = new int[6], vetorPar =  new int[6], vetorImpar = new int[6];
        int randomNumber, somaPares = 0, somaImpares = 0;

        for (int i = 0; i<vetor.length;  i++){
            randomNumber = random.nextInt(100);
            vetor[i] = randomNumber;
            
            if (vetor[i]%2 == 0){
                vetorPar[i] = vetor[i];
                somaPares += vetorPar[i];
            } else{
                vetorImpar[i] = vetor[i];
                somaImpares += vetorImpar[i];
            }
        }

        System.out.print("Vetor Original -->");
        for (int i = 0; i<vetor.length;  i++){            
            System.out.print(vetor[i] + " | ");
        }

        System.out.print("\n\nVetor de Pares --> ");
        for (int i = 0; i<vetorPar.length;  i++){        
            if (vetorPar[i] > 0){
                System.out.print(vetorPar[i] + " | ");
            }
        }
        System.out.print("\nSoma dos valores Pares --> " + somaPares);

        System.out.print("\n\nVetor de Impares --> ");
        for (int i = 0; i<vetorImpar.length;  i++){        
            if (vetorImpar[i] > 0){
                System.out.print(vetorImpar[i] + " | ");
            }
        }
        System.out.print("\nSoma dos valores Impares --> " + somaImpares);
    }
}
