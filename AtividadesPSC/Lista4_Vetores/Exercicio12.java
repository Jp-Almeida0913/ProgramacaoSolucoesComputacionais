import java.util.Random;

public class Exercicio12 {
    public static void main(String[] args){
        Random random = new Random();
        int[] vetor = new int[10];
        int randomNumber, avarage = 0;

        for(int i = 0; i<vetor.length; i++){
            randomNumber = random.nextInt(10);
            vetor[i] = randomNumber;
            avarage = avarage += vetor[i];
        }

        System.out.print("Nota dos alunos --> | ");
        for (int i = 0; i < vetor.length ; i++){
            System.out.print( i+1 + "º aluno nota:" +vetor[i] + " | ");
        }

        avarage = avarage/vetor.length;
        System.out.print("\n\nMédia da nota dos alunos --> " + avarage);

        System.out.print("\n\nAlunos com a nota abaixo da média --> | ");
        for (int i = 0; i < vetor.length ; i++){
            if (vetor[i] < avarage){
                System.out.print(i+1 + "º aluno nota:" +vetor[i] + " | ");
            }
        }

        System.out.print("\n\nAlunos com a nota acima da média --> | ");
        for (int i = 0; i < vetor.length ; i++){
            if (vetor[i] > avarage){
                System.out.print(i+1 + "º aluno nota:" +vetor[i] + " | ");
            }
        }
    }
}
