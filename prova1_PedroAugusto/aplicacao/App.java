import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //Lista alunos
        List<Aluno> alunos = new ArrayList<>();

        //Lista de funcionarios (usuario e senha)
        Map<String, String> funcionarios = new HashMap<>();
        funcionarios.put("func01", "123");  //funcionario 1
        funcionarios.put("func02", "456");  //funcionario 2
        funcionarios.put("func03", "789");  //funcionario 3

        int opcao = 0;

        while (opcao != 3) {

            System.out.print(menu());
            opcao = s.nextInt();
            s.nextLine();

            if(opcao == 1) {

                int tentativas = 3;
                boolean loginBemSucedido = false;

                while(tentativas > 0 && !loginBemSucedido) {

                    //validar usuario
                    System.out.print("Usuário: ");
                    String funcionario = s.nextLine();

                    //validar senha
                    System.out.print("Senha: ");
                    String senha = s.nextLine();

                    if(funcionarios.containsKey(funcionario) && funcionarios.get(funcionario).equals(senha)) {

                        //loginBemSucedido = true para sair do loop
                        loginBemSucedido = true;
                        
                        //opções do submenu
                        int opcaoSubMenu = 0;

                        while (opcaoSubMenu != 3) {
                            System.out.println();
                            System.out.print(subMenu());
                            opcaoSubMenu = s.nextInt();
                            s.nextLine();

                            if(opcaoSubMenu == 1) {
                                System.out.println();
                                System.out.print("Código do aluno: ");
                                String codigo = Utilitaria.gerarCodigo();
                                System.out.println(codigo);
    
                                System.out.print("Nome do aluno: ");
                                String nome = s.nextLine();
    
                                System.out.print("Telefone: ");
                                String telefone = s.nextLine();
    
                                while (!Utilitaria.validaTel(telefone)) {
                                    System.out.print("Telefone inválido. Digite novamente: ");
                                    telefone = s.nextLine();
                                }
    
                                System.out.print("Categoria: ");
                                int categoria = s.nextInt();
    
                                if(categoria != 1) {
                                    System.out.print("Acessos: ");
                                    int acessos = s.nextInt();
    
                                    alunos.add(new Aluno(codigo, nome, telefone, acessos, categoria));
                                    Academia academia = new Academia();
                                    academia.atualiza(alunos.size());
                                    Academia.acessos += acessos;
    
                                }else{
    
                                    alunos.add(new Aluno(codigo, nome, telefone, categoria));
                                    Academia academia = new Academia();
                                    academia.atualiza(alunos.size());
    
                                }
    
                            }else if(opcaoSubMenu == 2){
                                imprimirLista(alunos);
                            }
                        }

                    }else{
                        System.out.println("Usuário ou senha incorretos.");
                        tentativas--;
                    }
                }
                if(!loginBemSucedido) {
                    System.out.println("Número de tentativas esgotou.");
                    break;
                }
                
            } else if (opcao == 2) {
                boolean encontrado = false;
                System.out.print("Código do aluno: ");
                String codAluno = s.nextLine();

                for (Aluno aluno : alunos) { 
                    if (aluno.getCodigo().equals(codAluno)) { 
                        encontrado = true; 
                        break;
                    }
                }
                
                if(encontrado == true){
                    for(int i = 0; i < alunos.size(); i++) {

                        if(alunos.get(i).getCodigo().equals(codAluno) && encontrado == true) {
                            if(alunos.get(i).getCategoria() != 1) {
                                if(alunos.get(i).getCategoria() == 2 && alunos.get(i).getAcessos() == 1){
                                    System.out.println(alunos.get(i).exibe(alunos.get(i).getCategoria()));
                                    System.out.println("Sem mais aulas gratuitas disponíveis");
                                    System.out.println();

                                }else if(alunos.get(i).getCategoria() == 2 && alunos.get(i).getAcessos() < 1){
                                    alunos.get(i).incrementarAcesso();
                                    System.out.println(alunos.get(i).exibe(alunos.get(i).getCategoria()));
                                    Academia.acessos++;
                                    System.out.println();

                                }else if(alunos.get(i).getCategoria() == 3 && alunos.get(i).getAcessos() == 2){
                                    System.out.println(alunos.get(i).exibe(alunos.get(i).getCategoria()));
                                    System.out.println("Sem mais aulas gratuitas disponíveis");
                                    System.out.println();
                                    
                                }else if(alunos.get(i).getCategoria() == 3 && alunos.get(i).getAcessos() < 2){
                                    alunos.get(i).incrementarAcesso();
                                    System.out.println(alunos.get(i).exibe(alunos.get(i).getCategoria()));
                                    Academia.acessos++;
                                    System.out.println();
                                }

                    
                            }else{
                                System.out.println(alunos.get(i).exibe());
                                System.out.println("Sem direito a aulas gratuitas com personal.");
                                System.out.println();
                            }
                            break;
                        }
                    }
                }else{
                    System.out.println("Aluno não cadastrado.");
                    System.out.println();
                }
            }
        }
    }

    public static String menu() {
        String menu = "     MENU    \n\n1-ACADEMIA\n2-PERSONAL\n3-SAIR\n\nDIGITE A OPÇÃO: ";
        return menu;
    }

    public static String subMenu() {
        String menu = "     Sub MENU    \n\n1-CADASTRO\n2-RELATÓRIO\n3-VOLTAR\n\nDIGITE A OPÇÃO: ";
        return menu;
    }

    public static void imprimirLista(List<Aluno> lista) {
        System.out.println("    RELATÓRIO   ");
        System.out.println();
        for (Aluno aluno : lista) {
            if(aluno.categoria != 1) {
                System.out.println(aluno.exibe(aluno.categoria));
                System.out.println();
            }else{
                System.out.println(aluno.exibe());
                System.out.println();
            }
        }
        System.out.println("TOTAL DE ALUNOS: " + lista.size());
        System.out.println("ACESSOS: " + Academia.acessos);
        System.out.println();
    }
}