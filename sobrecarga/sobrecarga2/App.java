package sobrecarga.sobrecarga2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Adicao1 add = new Adicao1();

        int opcao = 0;

        do {
            System.out.println("Menu:\n1 - Inteiro\n2 - Reais\n3 - Sair");

            opcao = s.nextInt();

            switch (opcao) {
                case 1:
                    Dados1 dados1 = new Dados1(2, 3);
                    System.out.println(add.exibe(dados1.getA(), dados1.getB(), add.add(dados1.getA(), dados1.getB())));
                    System.out.println();
                    break;
                case 2:
                    dados1 = new Dados1(2.5f,3.5f);
                    System.out.println(add.exibe(dados1.getC(), dados1.getD(), add.add(dados1.getC(), dados1.getD())));
                    System.out.println();
            }    
        } while (opcao != 3);
    }
}