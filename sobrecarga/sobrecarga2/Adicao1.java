package sobrecarga.sobrecarga2;

public class Adicao1 {

    public int add(int a, int b){
        int result = a + b;
        return result;
    }

    public float add(float c, float d){
        float result = c + d;
        return result;
    }

    public String exibe(int a, int b, int result){
        return "A soma de " + a + " + " + b + " é igual a " + result;
    }

    public String exibe(float c, float d, float result){
        return "A soma de " + c + " + " + d + " é igual a " + result;
    }
}

/* faça uma aplicação que exiba o menu

1 - inteiro
2 - reais
3 - sair 

A aplicação não pode ter as variáveis que representam os números inteiros e reais.*/