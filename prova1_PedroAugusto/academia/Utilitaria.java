import java.util.Random;

public class Utilitaria {
    
    public static final Random RANDOM = new Random();   

    public static String gerarCodigo() {
        String letras = "abcdefghijklmnopqrstuvwxyz";
        String numeros = "1234567890";
        StringBuilder codigo = new StringBuilder(6);

        for(int i = 0; i < 3; i++) { 
            int index = RANDOM.nextInt(letras.length()); 
            codigo.append(letras.charAt(index));
        }

        for(int i = 0; i < 3; i++) {
            int index = RANDOM.nextInt(numeros.length());
            codigo.append(numeros.charAt(index));
        }
        return codigo.toString();
    }

    public static boolean validaTel(String telefone) {
        if(telefone.matches("[(]3(([1-5])|([7-9]))[)] 9[8-9]\\d{3}-\\d{4}")) {
            return true;
        }else{
            return false;
        }
    }
}
