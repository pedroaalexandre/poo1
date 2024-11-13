import java.util.Scanner;

public class App {

    public static double leCoordenada (int indice){
        Scanner s = new Scanner(System.in);
        double valorLeitura = 0;

        if(indice == 1){
            System.out.print("Digite o valor de x1: ");
            valorLeitura = s.nextDouble();
            return valorLeitura;
        }else if(indice == 2){
            System.out.print("Digite o valor de y1: ");
            valorLeitura = s.nextDouble();
            return valorLeitura;
        }else if(indice == 3){
            System.out.print("Digite o valor de x2: ");
            valorLeitura = s.nextDouble();
            return valorLeitura;
        }else{
            System.out.print("Digite o valor de y2: ");
            valorLeitura = s.nextDouble();
            return valorLeitura;
        }
    }

    public static boolean valida(double x1, double y1, double x2, double y2){
        if(x1 == x2 && y1 == y2){
            return false;
        }else{
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x1, y1, x2, y2;
        int contadorRetas = 0;
        char repetir;

        do {
            x1 = leCoordenada(1);
            y1 = leCoordenada(2);
            x2 = leCoordenada(3);
            y2 = leCoordenada(4);

            valida(x1, y1, x2, y2);

            if(valida(x1, y1, x2, y2) == false){
                System.out.println("Não é uma reta!");
            }else{
                Retas retas = new Retas(0, 0, 0, 0);

                retas.setX1(x1);
                retas.setY1(y1);
                retas.setX2(x2);
                retas.setY2(y2);

                System.out.println(retas.exibe());
            }

            contadorRetas++;

            System.out.println("Deseja resolver uma nova equacao?");
            repetir = s.next().charAt(0);
            
        } while ((repetir == 'S') || (repetir == 's'));

        System.out.println("Foram contadas " + contadorRetas + " retas.");
    }
}
