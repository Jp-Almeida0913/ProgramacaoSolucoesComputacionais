import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int horaInicio, minutoInicio, horaTermino, minutoTermino, duracao;

        System.out.print("Hora de início --> ");
        horaInicio = scan.nextInt();
        System.out.print("Minuto de início --> ");
        minutoInicio = scan.nextInt();
        System.out.print("Hora de término --> ");
        horaTermino = scan.nextInt();
        System.out.print("Minuto de término --> ");
        minutoTermino = scan.nextInt();

        duracao = tempoJogo(horaInicio, minutoInicio, horaTermino, minutoTermino);
        System.out.println("Duração do jogo em minutos --> " + duracao);

        scan.close();
    }

    public static int tempoJogo(int horaInicio, int minutoInicio, int horaTermino, int minutoTermino) {
        int inicioEmMinutos = horaInicio * 60 + minutoInicio;
        int terminoEmMinutos = horaTermino * 60 + minutoTermino;

        if (terminoEmMinutos <= inicioEmMinutos) {
            terminoEmMinutos += 24 * 60;
        }

        return terminoEmMinutos - inicioEmMinutos;
    }
}