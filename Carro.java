import java.util.Scanner;

public class Carro {
    private double tanque;
    private double consumo;

    public Carro(double tanque, double consumo){
        this.tanque = tanque;
        this.consumo = consumo;
    }

    public double getTanque() {
        return tanque;
    }

    public double getConsumo() {
        return consumo;
    }

    public void abastecer(double litros){
        if((tanque >= 0) && (tanque < 50)){
            this.tanque += litros;
            if(tanque >= 50){
                tanque = 50;
            }
        }
    }

    public void dirigir(double dist){
        double litros = dist / consumo;
        if((tanque > 0) && (tanque <= 50)){
            this.tanque -= litros;
            if(tanque < 0){
                tanque = 0;
            }
        }
        
    }

    public static void main(String[] args) {
        System.out.println("Infome abaixo o consumo de seu carro: ");
        Scanner s = new Scanner(System.in);
        double consumo = s.nextDouble();
        
        Carro car1 = new Carro(0, consumo);
        System.out.println("Seu carro está com o tanque vazio. Favor abasteça.\nQuantos litros você quer abastecer, entre 1 a 50 litros?");
        double litros = s.nextDouble();
        car1.abastecer(litros);
        System.out.println("Seu carro está abastecido com " + car1.getTanque() + " litros.\nQual distância de sua viagem, em quilômetros?");
        double dist = s.nextDouble();
        car1.dirigir(dist);
        System.out.println("Você percorreu " + dist + " km, restam " + car1.getTanque() + " litros em seu tanque.");
        
        
        s.close();
    }
}
