package relacionamentoclasses.exercicio;

public class RelacionamentoClassesExercicio {
    
    public static void main(String[] args) {
        // Criando a Universidade
        Universidade univ = new Universidade("UFU");

        // Criando Departamentos dentro da Universidade
        Departamento depMat = univ.criarDepartamento("Matemática","Bloco A - Santa Mônica");
        Departamento depMed = univ.criarDepartamento("Medicina","Bloco E - Umuarama");

        // Criando Pessoas
        Pessoa aluno1 = new Pessoa("João", 20, 'm');
        Pessoa aluno2 = new Pessoa("Maria", 22, 'f');
        Pessoa professor = new Pessoa("Dr. Clarimundo", 45, 'm');

        // Associando Pessoas aos Departamentos
        aluno1.setDepartamento(depMat);
        aluno2.setDepartamento(depMed);
        professor.setDepartamento(depMat);

        // Exibindo detalhes da Universidade e Departamentos
        univ.exibe();

        // Exibindo detalhes das Pessoas
        System.out.println("\n\nDetalhes das Pessoas:");
        aluno1.exibe();
        aluno2.exibe();
        professor.exibe();
    }
    
}
