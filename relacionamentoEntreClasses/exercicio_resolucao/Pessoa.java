public class Pessoa {
    
    private String nome;
    private int idade;
    private char sexo;
    private Departamento depto;     //Agregação com Departamento

    
    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public void setDepto(Departamento depto) {
        this.depto = depto;
    }

    public void exibir() {
        System.out.println("\nNome: " + nome + "\nIdade: " + idade + "\nSexo: " + sexo);
        if (depto != null) {
            System.out.println("Departamento: " + depto.getNome() + "\nLocalização: " + depto.getLocalizacao());
        }
    }
}
