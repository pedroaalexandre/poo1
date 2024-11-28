package sobrecarga.sobrecarga2;

public class Dados1{
    private int a, b;
    private float c, d;

    public Dados1(int a, int b){
        this.a = a;
        this.b = b;
    }

    public Dados1(float c, float d){
        this.c = c;
        this.d = d;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public float getD() {
        return d;
    }

    public void setD(float d) {
        this.d = d;
    }

    
}