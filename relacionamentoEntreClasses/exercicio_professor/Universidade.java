package relacionamentoclasses.exercicio;

import java.util.ArrayList;
import java.util.List;

public class Universidade {
    private String nome;
    private List<Departamento> departamentos;  // Composição com Departamento

    public Universidade(String nome) {
        this.nome = nome;
        this.departamentos = new ArrayList<>();
    }

    // Cria e adiciona um Departamento à universidade
    public Departamento criarDepartamento(String nomeDepartamento, String local) {
        Departamento dep = new Departamento(nomeDepartamento,local);
        departamentos.add(dep);
        return dep;                // Esse retorno é associado a uma pessoa
    }

    public void exibe() {
        System.out.println("Universidade: " + nome);
        System.out.println("Departamentos:");
        for (Departamento dep : departamentos) {
            dep.exibe();
        }
    }
}
