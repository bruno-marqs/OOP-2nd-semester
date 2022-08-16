public class Retangulo {
    private double base;
    private double altura;

    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double getBase(){
        return base;
    }

    public double getAltura(){
        return altura;
    }

    public void setBase(double novaBase){
        this.base = novaBase;
    }

    public double calcularArea(){
        return altura * base;
    }

    public double calcularPerim(){
        return (base + altura) * 2;
    }

    public static void main(String[] args) {
         Retangulo ret1 = new Retangulo(5.7, 8.9);
         System.out.println(String.format("A area do retangulo é %.2f", ret1.calcularArea()));
         System.out.println(String.format("O perimetro é igual a %.2f", ret1.calcularPerim()));
    }

}

