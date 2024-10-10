package equacaoSegundoGrau;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String repetir = "S";
        while(repetir.equals("S")){

            double a,b,c,d,x1,x2;

            do {
                a = le(1);
            } while (a <= 0);
            b = le(2);
            c = le(3);
            
            EGrau2 EGrau2 = new EGrau2(a, b, c);

            d = EGrau2.delta();

            x1 = EGrau2.calculaX1(d);

            x2 = EGrau2.calculaX2(d);

            if(d <= 0){
                System.out.println("O delta é menor ou igual a 0. Não existem raízes reais!");
            }else{
                System.out.println(exibe(x1, x2));
                System.out.println();   
            }
            System.out.println("Deseja resolver uma nova equação? (S ou N):");
            repetir = s.next();
        }
    }

    public static double le(int x){
        Scanner s = new Scanner(System.in);
        double n;

        if(x == 1){
            System.out.println("Digite o valor de a (a > 0):");
            return n = s.nextDouble();
        }else if(x == 2){
            System.out.println("Digite o valor de b:");
            return n = s.nextDouble();
        }else{
            System.out.println("Digite o valor de c:");
            return n = s.nextDouble();
        }
    }

    public static String exibe(double x1, double x2) {
        String exibe = "As raízes da equação são " + x1 + " e " + x2;
        return exibe;
    }
}