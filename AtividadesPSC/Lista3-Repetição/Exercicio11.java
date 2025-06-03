
public class Exercicio11 {
    public static void main(String[] args) {
        double bruzundangas = 90000000, milano = 200000000, taxaBruzundangas = 0.03, taxaMilano = 0.015;
        int anos = 0;

        while (bruzundangas < milano) {
            bruzundangas += bruzundangas * taxaBruzundangas;
            milano += milano * taxaMilano;
            anos++;
        }

        System.out.println("Serão necessários " + anos + " anos para que a população dos Bruzundangas alcance ou ultrapasse a população dos Milanos.");
    }
}