public class Exercicio01 {
    public static void main(String[] args){
        Exercicio01 obj = new Exercicio01();
        System.out.println(obj.divisaoDosNumerosBeCporA(0.0, 2.0, 4.0));

}
    public double divisaoDosNumerosBeCporA(Double a, Double b, Double c){
        Double result = 0.0;
        if (a < 1){
            System.out.println( "O valor de A não pode ser menor que 1");
        }
        if (b <= c){
            while( b <= c){
                if (  b%a == 0){
                    result += b;
                }
                b+=1;
            }
        }else{
            if (c <= b){
                if (c%a == 0){
                result +=c;
            }
            c+=1;
        }
        }

        return result;
    }
}
