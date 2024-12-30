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
                            System.out.print(subMenu());
                            opcaoSubMenu = s.nextInt();
                            s.nextLine();

                            if(opcaoSubMenu == 1) {
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
    
                                }else{
    
                                    alunos.add(new Aluno(codigo, nome, telefone, categoria));
    
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
                System.out.println("Hello world!");
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
        for (Aluno aluno : lista) {
            if(aluno.categoria != 1) {
                System.out.println(aluno.exibe(aluno.categoria));
                System.out.println();
            }else{
                System.out.println(aluno.exibe());
                System.out.println();
            }
        }
    }
}