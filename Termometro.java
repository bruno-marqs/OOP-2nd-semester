import java.util.Scanner;

public class Termometro {
    private double temp;

    public Termometro(double temp){
        this.temp = temp;
    }

    public double getTemp() {
        return temp;
    }

    public double converter(double temp){
        double celsius = (5 * (temp - 32)) / 9;
        return celsius;
    }

    public static void main(String[] args) {
        System.out.println("Insira a temperatura em Fahrenheit e converta em Celsius");
        Scanner s = new Scanner(System.in);
        double temp = s.nextDouble();
        Termometro t1 = new Termometro(temp);
        System.out.printf("A temperatura é igual a %.1f ", t1.converter(temp));
        s.close();
    }
}
