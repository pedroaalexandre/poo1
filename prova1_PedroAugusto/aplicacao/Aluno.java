public class Aluno {

    private String codigo;

    private String nome;

    private String telefone;
    
    private int acessos;

    int categoria;

    public Aluno(String codigo, String nome, String telefone, int categoria) {
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
        this.categoria = categoria;
    }

    public Aluno(String codigo, String nome, String telefone, int acessos, int categoria) {
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
        this.acessos = acessos;
        this.categoria = categoria;
        Academia.acessos++;
    }

    public String exibe() {
        return "Código: " + codigo + "\nNome: " + nome + "\nTelefone: " + telefone + "\nCategoria: " + categoria;
    }

    public String exibe(int categoria) {
        return "Código: " + codigo + "\nNome: " + nome + "\nTelefone: " + telefone + "\nCategoria: " + categoria + "\nAcessos: " + acessos;
    }

}