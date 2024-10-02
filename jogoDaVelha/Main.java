import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        int jogador = 1;    //Declaração int jogador

        int tabuleiro [][] = new int[3][3];     //Declaração matriz tabuleiro

        for(int i = 0; i < tabuleiro.length; i++) {     //Preencher todas as posições com 0
            for(int j = 0; j < tabuleiro.length; j++) {
                tabuleiro[i][j] = 0; 
            }
        }

        interfaceJogo(jogador, tabuleiro); //Chamada da interface do jogo da velha

    }

    static int interfaceJogo (int jogador, int[][] tabuleiro) {
        Scanner s = new Scanner(System.in);

        while(vitoria(tabuleiro) == false) {
            System.out.println("Tabuleiro atual:");

            for(int i = 0; i < tabuleiro.length; i++) {     //Imprmir o tabuleiro ("-" se for 0, "X" se for 1 e "O" se for 2)
                System.out.println();
                for (int j = 0; j < tabuleiro.length; j++) {
                    if(tabuleiro[i][j] == 0) {
                        System.out.print("- ");
                    }else if(tabuleiro[i][j] == 1) {
                        System.out.print("X ");
                    }else{
                        System.out.print("O ");
                    }
                }
            }

            System.out.println();

            System.out.println("\n1 2 3\n4 5 6\n7 8 9\n");  //Tabela para referenciar as jogadas 

            if(jogador == 1) {     //Mensagem mostrando de qual jogador é a vez
                System.out.println("Jogador 'X' é sua vez de jogar!");
            }else{
                System.out.println("Jogador 'O' é sua vez de jogar!");
            }

            System.out.print("Escolha uma posição: ");

            int posicao = s.nextInt();      //Variável para definir a posição de acordo com a tabela referencial

            if(jogador == 1 && posicao == 1 || jogador == 2 && posicao == 1) {
                tabuleiro[0][0] = jogador;
            }else if(jogador == 1 && posicao == 2 || jogador == 2 && posicao == 2) {
                tabuleiro[0][1] = jogador;
            }else if(jogador == 1 && posicao == 3 || jogador == 2 && posicao == 3) {
                tabuleiro[0][2] = jogador;
            }else if(jogador == 1 && posicao == 4 || jogador == 2 && posicao == 4) {
                tabuleiro[1][0] = jogador;
            }else if(jogador == 1 && posicao == 5 || jogador == 2 && posicao == 5) {
                tabuleiro[1][1] = jogador;
            }else if(jogador == 1 && posicao == 6 || jogador == 2 && posicao == 6) {
                tabuleiro[1][2] = jogador;                
            }else if(jogador == 1 && posicao == 7 || jogador == 2 && posicao == 7) {
                tabuleiro[2][0] = jogador; 
            }else if(jogador == 1 && posicao == 8 || jogador == 2 && posicao == 8) {
                tabuleiro[2][1] = jogador;
            }else if(jogador == 1 && posicao == 9 || jogador == 2 && posicao == 9) {
                tabuleiro[2][2] = jogador;
            }

            if(validacao(posicao, tabuleiro) == false) {    //Chamada da posição de validação
                restricao();
                interfaceJogo(jogador, tabuleiro);         //Se a posição for inválida, chama a função restricao
            }else{
                vitoria(tabuleiro);
                jogador = (jogador == 1) ?  2 : 1;      //Função ternária para alternar entre jogador1 e jogador2
                interfaceJogo(jogador, tabuleiro);
            }
        }
        return 0;
    }

    static boolean validacao (int posicao, int [][] tabuleiro) {    //Validar se a posição da jogada é valida, ou seja, está vazia
        if(posicao == 1 && tabuleiro[0][0] == 0) {
            return true;
        }else if(posicao == 2 && tabuleiro[0][1] == 0) {
            return true;
        }else if(posicao == 3 && tabuleiro[0][2] == 0) {
            return true;
        }else if(posicao == 4 && tabuleiro[1][0] == 0) {
            return true;
        }else if(posicao == 5 && tabuleiro[1][1] == 0) {
            return true;
        }else if(posicao == 6 && tabuleiro[1][2] == 0) {
            return true;
        }else if(posicao == 7 && tabuleiro[2][0] == 0) {
            return true;
        }else if(posicao == 8 && tabuleiro[2][1] == 0) {
            return true;
        }else if(posicao == 9 && tabuleiro[2][2] == 0) {
            return true;
        }else{
            return false;
        }
    }

    static boolean vitoria(int tabuleiro[][]) {
        if(tabuleiro[0][0] == 1 && tabuleiro[0][1] == 1 && tabuleiro[0][2] == 1 || tabuleiro[1][0] == 1 && tabuleiro [1][1] == 1 && tabuleiro [1][2] == 1 || tabuleiro[2][0] == 1 && tabuleiro [2][1] == 1 && tabuleiro[2][2] == 1) {
            System.out.println("O Jogador 'X' venceu!");
            return true;
        }else if(tabuleiro[0][0] == 1 && tabuleiro [1][0] == 1 && tabuleiro[2][0] == 1 || tabuleiro[0][1] == 1 && tabuleiro[1][1] == 1 && tabuleiro[2][1] == 1 || tabuleiro[0][2] == 1 && tabuleiro[1][2] == 1 && tabuleiro[2][2] == 1) {
            System.out.println("O Jogador 'X' venceu!");
            return true;
        }else if(tabuleiro[0][0] == 1 && tabuleiro[1][1] == 1 && tabuleiro[2][2] == 1 || tabuleiro[0][2] == 1 && tabuleiro[1][1] == 1 && tabuleiro[2][0] == 1) {
            System.out.println("O Jogador 'X' venceu!");
            return true;
        }else if(tabuleiro[0][0] == 2 && tabuleiro[0][1] == 2 && tabuleiro[0][2] == 2 || tabuleiro[1][0] == 2 && tabuleiro [1][1] == 2 && tabuleiro [1][2] == 2 || tabuleiro[2][0] == 2 && tabuleiro [2][1] == 2 && tabuleiro[2][2] == 2) {
            System.out.println("O Jogador 'O' venceu!");
            return true;
        }else if(tabuleiro[0][0] == 2 && tabuleiro [1][0] == 2 && tabuleiro[2][0] == 2 || tabuleiro[0][1] == 2 && tabuleiro[1][1] == 2 && tabuleiro[2][1] == 2 || tabuleiro[0][2] == 2 && tabuleiro[1][2] == 2 && tabuleiro[2][2] == 2) {
            System.out.println("O Jogador 'O' venceu!");
            return true;
        }else if(tabuleiro[0][0] == 2 && tabuleiro[1][1] == 2 && tabuleiro[2][2] == 2 || tabuleiro[0][2] == 2 && tabuleiro[1][1] == 2 && tabuleiro[2][0] == 2) {
            System.out.println("O Jogador 'O' venceu!");
            return true;
        }else{
            if(empate(tabuleiro) == true){
                return false;
            }else{
                System.out.println("Deu velha!");
                return false;
            }
        }
    }

    static void restricao () {      //Imprimir caso a funcao validacao retorne false
        System.out.print("\nJOGADA INVÁLIDA\n");
    }

    static boolean empate (int[][] tabuleiro) {
        if(tabuleiro[0][0] == 0 || tabuleiro[0][1] == 0 || tabuleiro[0][2] == 0 || tabuleiro[1][0] == 0 || tabuleiro[1][1] == 0 || tabuleiro[1][2] == 0 || tabuleiro[2][0] == 0 || tabuleiro[2][1] == 0 || tabuleiro[2][2] == 0) {
            return true;
        }else{
            return false;
        }
    }

}