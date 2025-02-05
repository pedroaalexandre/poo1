public class App {
    public static void main(String[] args) {

        //Criando universidade
        Universidade universidade =  new Universidade("Universidade Federal");
       
        //Criando departamentos dentro da Universidade
        Departamento deptoMat = universidade.criarDepartamento("Matemática", "Bloco A - Santa Mônica");
        Departamento deptoMed = universidade.criarDepartamento("Medicina", "Bloco b - Santa Mônica");

        //Criando pessoas
        Pessoa aluno1 = new Pessoa("Pedro", 21, 'm');
        Pessoa aluno2 = new Pessoa("Gabriele", 19, 'f');
        Pessoa professor = new Pessoa("Dr. Clarimundo", 45, 'm');

        //Associando pessoas aos Departamento
        aluno1.setDepto(deptoMat);
        aluno2.setDepto(deptoMed);
        professor.setDepto(deptoMat);

        //Exibindo detalhes da Universidade e Departamentos
        universidade.exibir();

        //Exibindo detalhes das pessoas
        System.out.println("\n \nDetalhes das Pessoas:");
        aluno1.exibir();
        aluno2.exibir();
        professor.exibir();


    }

}