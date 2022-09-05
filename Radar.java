import java.util.Scanner;

public class Radar {
    private double velocPermit;

    public Radar(double velocPermit){
        this.velocPermit = velocPermit;
    }

    public double getVelocPermit() {
        return velocPermit;
    }

    public void verify(double velocidade){
        if(velocidade <= velocPermit){
            System.out.println("Não ultrapassou o limite de velocidade. Tá sussa, pae");
        }
        else if((velocidade > velocPermit) && (velocidade <= velocPermit + (velocPermit * 0.2))){
            double multa = 250;
            System.out.println("Ultrapassou até 20% do permitido. A multa será de R$" + multa + ".");
        }
        else if(velocidade > velocPermit + (velocPermit * 0.2)){
            double multa = 750;
            System.out.println("Ultrapassou além de 20% do permitido. A multa será de R$" + multa +".");
        }
    }

    public static void main(String[] args) {
        System.out.println("Insira abaixo o limite de velocidade, em km/h:");
        Scanner s = new Scanner(System.in);
        double velocPermit = s.nextDouble();
        Radar pardal1 = new Radar(velocPermit);

        System.out.println(" ");
        System.out.println("Conferindo a velocidade máxima registrada:");
        pardal1.getVelocPermit();
        System.out.println(" ");

        while(true){
            System.out.println("Insira aqui a velocidade percebida:");
            double velocidade = s.nextDouble();
            pardal1.verify(velocidade);
        }

    }
}
