package Exercicio3_aula;

import java.util.Scanner;

public class App {
    public static final String USERMASTER = "Pedro"; 
    public static final String SENHAMASTER = "Pedro@123";

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        boolean tentativa = false;
        String usuario, senha, telefone;

        System.out.print("Digite o usuário: ");
        usuario = s.nextLine();

        System.out.print("Digite a senha: ");
        senha = s.nextLine();

        System.out.print("Digite o telefone: ");
        telefone = s.nextLine();

        do {
            try {

                validarUserPass(usuario, senha, telefone);

                tentativa = true;

                System.out.println(usuario + " " + senha);
            }
            catch (Validacoes e){
                System.err.println(e.toString());
            }

        } while (!tentativa);
    }

    public static void validarUserPass(String usuario, String senha, String telefone) throws Validacoes {
        if (!usuario.equals(USERMASTER)) {
            throw new Validacoes(usuario, senha, telefone);
        } else if (!senha.equals(SENHAMASTER)){
            throw new Validacoes(usuario, senha, telefone);
        }else if (telefone.matches("[(]\\d{2}[)] 9\\d{4}-\\d{4}")){
            throw new Validacoes(usuario, senha, telefone);
        }
    }
}
