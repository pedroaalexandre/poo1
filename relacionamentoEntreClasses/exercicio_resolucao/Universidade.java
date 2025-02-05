import java.util.ArrayList;
import java.util.List;

import javax.crypto.spec.DESKeySpec;

public class Universidade {
    
    private String nome;
    private List<Departamento> deptos;      //Composição departamentos

    
    //Construtor da classe
    public Universidade(String nome) {
        this.nome = nome;
        this.deptos = new ArrayList<>();
    }

    //Cria e adiciona um departamento à universidade
    public Departamento criarDepartamento(String nomeDepartamento, String local) {
        Departamento depto = new Departamento(nomeDepartamento, local);
        deptos.add(depto);
        return depto;
    }

    //Exibição
    public void exibir() {
        System.out.println("Universidade: " + nome);
        System.out.println("Deparmentos:");
        for (Departamento depto : deptos) {
            depto.exibir();
        }
    }

    
}
