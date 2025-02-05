package Exercicio2_aula;

public class Prog5Tratamento {
    public static void main(String[] args) {
        
        int [] num = {4, 8, 5, 16, 32, 21, 64, 128, 62, 80, 90};
        int [] den= {2, 0, 4, 8, 0, 2, 4};

        for(int i=0; i<num.length; i++) {

            try {
                validarDivisao(num[i], den[i]);
                
                System.out.println(num[i] + "/" + den[i] + " = " + (num[i]/den[i]));
            }

            catch(ArithmeticException ex1) {
                System.err.println("Erro matemático: " + ex1.getMessage());
            }

            catch(ArrayIndexOutOfBoundsException ex2) {
                System.err.println("Erro no vetor: " + ex2.getMessage());
            } 
            
            catch (DvisaoNaoExata ex){
                System.err.println(ex.toString());
            }
        }
    }

    public static void validarDivisao(int num, int den) throws DvisaoNaoExata {
        if(num % 2 != 0)
            throw new DvisaoNaoExata(num, den);
    }
}
