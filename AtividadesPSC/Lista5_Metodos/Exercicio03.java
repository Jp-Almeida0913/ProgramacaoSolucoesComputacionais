import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int seconds;
        Exercicio03 obj = new Exercicio03();
        System.out.print("Informe a quantidade de segundos --> ");
        seconds = scan.nextInt();
        obj.conversaoSegundos(seconds);
        scan.close();

}
    public void conversaoSegundos(int a){
        int days = 0, hour = 0, minutes = 0, seconds = a;

        if (seconds > 60){
            while (seconds > 0){
                if ( seconds >= 60){
                    seconds -= 60;
                    minutes = minutes + 1;
                }
                if (minutes >= 60){
                    minutes -= 60;
                    hour = hour += 1;
                }
                if (hour >= 24){
                    hour -= 24;
                    days = days +=1;
                }
            }
        }

        System.out.println(a + " Segundos convertendo resulta em:\n\nDias --> " +  days 
        + "\nHoras --> " + hour + "\nMinutos --> " + minutes + "\nSegundos --> " + seconds);
    }
}
