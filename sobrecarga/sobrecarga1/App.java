package sobrecarga.sobrecarga1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Adicao1 add = new Adicao1();

        int opcao;

        do {
            System.out.println("Menu:\n1 - Inteiro\n2 - Reais\n3 - Sair");

            opcao = s.nextInt();

            if(opcao == 1){
                Dados1 dados1 = new Dados1(2, 3);
                System.out.println(add.exibeInt(dados1.getA(), dados1.getB(), add.addInt(dados1.getA(), dados1.getB())));
                System.out.println();
                
            }else if(opcao == 2){
                Dados1 dados1 = new Dados1(2.5f,3.5f);
                System.out.println(add.exibeFloat(dados1.getC(), dados1.getD(), add.addFloat(dados1.getC(), dados1.getD())));
                System.out.println();

            }else if(opcao != 3){
                System.out.println("Opção inválida. Tente novamente:");
                System.out.println();
            }    
        } while (opcao != 3);
    }
}
