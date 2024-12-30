import java.util.Scanner;

public class ContaCorrente {

    Scanner s = new Scanner(System.in);

    private String nome;

    private String numeroConta;

    private double saldo;

    private String tipoConta = "comum";

    public ContaCorrente(String nome, String numeroConta, double saldo) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public ContaCorrente(String nome, String numeroConta, double saldo, String tipoConta) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.tipoConta = "especial";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public boolean sacar() {

        double valorSacar = s.nextDouble();
        double valorSacarFinal = valorSacar - (valorSacar * 0.001);

        if(saldo > valorSacar) {

            saldo -= valorSacarFinal;
            return true;
        }else{

            System.out.println("Saldo insuficiente.");
            return false;
        }
    }

    public boolean sacar(String tipoConta) {
        double valorSacar = s.nextDouble();
        double valorSacarFinal = valorSacar - (valorSacar * 0.002);

        if(saldo > valorSacar) {

            saldo -= valorSacarFinal;
            return true;
        }else{

            System.out.println("Saldo insuficiente.");
            return false;
        }
    }

    public void depositar() {

        double valor = s.nextDouble();
        double valorFinal = valor * 0.001;

        saldo += (valor - valorFinal);
    }


    

}

