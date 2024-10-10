package equacaoSegundoGrau;

public class EGrau2 {
    public double a,b,c;

    public EGrau2 (double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double delta(){
        return Math.pow(b, 2) - 4*a*c;
    }

    public double calculaX1(double d){
        double x1 = (-b + Math.sqrt(d))/2*a;
        return x1;
    }

    public double calculaX2(double d){
        double x2 = (-b - Math.sqrt(d))/2*a;
        return x2;
    }
}
