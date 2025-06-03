import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double mass, originalMass;
        int hour = 0 , seconds = 0, minute = 0;

        System.out.print("Insira a massa inicial do elemento\n--> ");
        mass = scan.nextDouble();
        originalMass = mass;


        while(mass > 0.5){
            mass = mass/2;
            seconds +=1;
            if (seconds >= 60){
                minute +=1;
                seconds = 0;
                if (minute >= 60){
                    hour +=1;
                    minute = 0;
                }
            }
        }

        System.out.println("Tempo decorrido para o elemento de massa " + originalMass 
        + " alcançar a 0.5 de massa foi:\nHoras:" + hour + "\nMinutos: " + minute + "\nSeconds: " + seconds);

        scan.close();

    }
}
