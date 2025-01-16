import java.util.Scanner;

public class Ex01 {
    public static void main (String[]args) {

        String senhaValidacao = "Pedro@123";
        boolean tentativa = true;

        do {
            try {
                senhaCorreta(senhaValidacao);
                tentativa = false;
            } catch (Exception e) {
                System.err.println("Senha incorreta!\n\n");
            }
        } while (tentativa);
    }

    public static void senhaCorreta(String senhaValidacao) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite a sua senha: ");
        String password = s.nextLine();

        if(senhaValidacao.equals(password)) {
           System.out.println("Senha correta!"); 
        }else{
            throw new SecurityException("Senha incorreta!");
        }
    }
}