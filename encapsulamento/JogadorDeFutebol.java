public class JogadorDeFutebol {

    private String nome; 
    public String nacionalidade;
    public char posicao;
    public int ano_nasc;
    public double altura, peso;

    public JogadorDeFutebol(String nome, char posicao, String nacionalidade, int ano_nasc, double altura, double peso) {
        this.nome = nome;
        this.posicao = posicao;
        this.nacionalidade = nacionalidade;
        this.ano_nasc = ano_nasc;
        this.altura = altura;
        this.peso = peso;
    }

    public int calculaIdade() {
        int idade = 2024 - ano_nasc;
        return idade;
    }

    public String exibe() {
        if(posicao == 'a'){
            return "Nome: " + nome + "\nAno de nascimento: " + ano_nasc + "\nAltura: " + altura + " m\nPeso: " + peso + " kg\nNacionalidade: " + nacionalidade + "\nPosicao: Atacante";
        }else if(posicao == 'b'){
            return "Nome: " + nome + "\nAno de nascimento: " + ano_nasc + "\nAltura: " + altura + " m\nPeso: " + peso + " kg\nNacionalidade: " + nacionalidade + "\nPosicao: Defesa";
        }else{
            return "Nome: " + nome + "\nAno de nascimento: " + ano_nasc + "\nAltura: " + altura + " m\nPeso: " + peso + " kg\nNacionalidade: " + nacionalidade + "\nPosicao: Meio de Campo";
        }
            
    }

    public String getNome() {
        return nome;
    }

}