package Exercicio3_aula;

public class Validacoes extends Exception {
    private String usuario;
    private String senha;
    private String telefone;

    public Validacoes(String usuario, String senha, String telefone) {
        super();
        this.usuario = usuario;
        this.senha = senha;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Usuário ou senha inválidos.";
    }

}
