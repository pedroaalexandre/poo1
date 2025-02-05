package relacionamentoclasses.exercicio;

public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;
    private Departamento dep;  // Agregação com Departamento

    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public void setDepartamento(Departamento dep) {
        this.dep = dep;
    }

    public void exibe() {
        System.out.println("\nNome: " + nome + "\nIdade: " + idade + "\nSexo: " + sexo);
        if (dep != null) {
            System.out.println("Departamento: " + dep.getNome() + "\nLocalização: " + dep.getLocalizacao());
        }
    }
}
