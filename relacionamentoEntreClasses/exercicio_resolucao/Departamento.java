public class Departamento {
    
    private String nome;
    private String localizacao;

    
    public Departamento(String nome, String localizacao) {
        this.nome = nome;
        this.localizacao = localizacao;
    }


    public String getNome() {
        return nome;
    }


    public String getLocalizacao() {
        return localizacao;
    }

    public void exibir() {
        System.out.println("Departamento: " + nome + "\nLocalização: " + localizacao);
    }
    
}
