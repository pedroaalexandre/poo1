import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double valorSaque;

        try {
            System.out.print("Digite o valor do saque: ");
            valorSaque = s.nextDouble();
            limiteSaque(valorSaque);

            System.out.printf("R$ %.2f sacados com sucesso!", valorSaque);
        } catch (ArithmeticException e) {
            System.err.println("O saque não pode ultrapassar R$ 2000.00.\n");
        }
    }

    public static boolean limiteSaque(double valorSaque) {
        if (valorSaque > 2000.0) {
            throw new ArithmeticException("O saque não pode ultrapassar R$ 2000.00");
        }
        return true;
    }
}