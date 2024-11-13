import java.util.Scanner;

public class App {
    public static void main(String[]args){
        JogadorDeFutebol jF;
        jF = leDados();
        System.out.println(jF.exibe());
        tempoAposentadoria(jF);
    }

    public static JogadorDeFutebol leDados() {
        Scanner s = new Scanner(System.in);

        System.out.println("Insira os dados do jogador:");
        System.out.print("Nome: ");
        String nome = s.nextLine();

        System.out.print("Ano de nascimento: ");
        int ano_nasc = s.nextInt();

        System.out.print("Altura: ");
        double altura = s.nextDouble();

        System.out.print("Peso: ");
        double peso = s.nextDouble();

        System.out.print("Nacionalidade: ");
        String nacionalidade = s.next();

        System.out.print("Posicao: a)Atacante, b)Defesa, c)Meio de Campo: ");
        char posicao = s.next().charAt(0);

        while (posicao != 'a' && posicao != 'b' && posicao != 'c') {
            System.out.println("Opcao invalida.");
            System.out.print("Posicao: a)Atacante, b)Defesa, c)Meio de Campo: ");
            posicao = s.next().charAt(0);
        }

        System.out.println();
        s.nextLine();

        return new JogadorDeFutebol(nome, posicao, nacionalidade, ano_nasc, altura, peso);
    }

    public static void tempoAposentadoria (JogadorDeFutebol jF){
        int aposentadoria;
        int idade = jF.calculaIdade();
        if(jF.posicao == 'a'){
            aposentadoria = 35 - idade;
            System.out.println("Faltam " + aposentadoria + " anos para o jogador " + jF.getNome() + " se aposentar.");
        }else if(jF.posicao == 'b'){
            aposentadoria = 40 - idade;
            System.out.println("Faltam " + aposentadoria + " anos para o jogador " + jF.getNome() + " se aposentar.");
        }else{
            aposentadoria = 38 - idade;
            System.out.println("Faltam " + aposentadoria + " anos para o jogador " + jF.getNome() + " se aposentar.");
        }
    }
}
