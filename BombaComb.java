import java.util.Scanner;

public class BombaComb {
    private int tipoComb;
    private double preco;
    private double qntComb;

    public BombaComb(int tipoComb, double preco, double qntComb){
        this.tipoComb = tipoComb;
        this.preco = preco;
        this.qntComb = qntComb;
    }

    public double getQntComb() {
        return qntComb;
    }

    public int getTipoComb() {
        return tipoComb;
    }

    public double getpreco() {
        return preco;
    }

    public void setTipoComb(int tipoComb) {
        this.tipoComb = tipoComb;
    }

    public void setpreco(double preco) {
        this.preco = preco;
    }

    public void setQntComb(double novaQnt) {
        this.qntComb -= novaQnt;
    }

    public double abastValor(double valor){
        double litros = valor / preco;
        setQntComb(litros);
        return litros;
    }

    public double abastLitro(double litros){
        double valor = litros * preco;
        setQntComb(litros);
        return valor;
    }

    
    public static void main(String[] args) {
        System.out.println("Bem vindo ao posto virtual.\nQual tipo de combustivel?\n1 - Gasolina\n2 - Alcool");
        Scanner s = new Scanner(System.in);
        int tipoComb = s.nextInt();

        while(qntComb != 0){
            
            if(tipoComb == 1){
                String nome = "Gasolina";
                double preco = 5.74;
                BombaComb bomba1 = new BombaComb(tipoComb, preco, 500);
                System.out.println("Você escolheu " + nome + ", ele custa " + preco + " reais por litro.");
                System.out.println("Como você quer abastecer?\n1 - Valor\n2 - Litros");
                int medida = s.nextInt();
    
                if(medida == 1){
                    System.out.println("Quantos reais você quer abastecer?");
                    double valor = s.nextDouble();
                    bomba1.abastValor(valor);
                    System.out.println("Restam " + bomba1.getQntComb() + " litros na bomba.");
                }
                else if(medida == 2){
                    System.out.println("Quantos litros você quer abastecer?");
                    double litros = s.nextDouble();
                    bomba1.abastLitro(litros);
                    System.out.println("Restam " + bomba1.getQntComb() + " litros na bomba.");
                }
                else{
                    System.out.println("Entrada inválida. Tente novamente.");
                }
                
            }
            else if(tipoComb == 2){
                String nome = "Alcool";
                double preco = 4.52;
                BombaComb bomba1 = new BombaComb(tipoComb, preco, 500);
                System.out.println("Você escolheu " + nome + ", ele custa " + preco + " reais por litro.");
                System.out.println("Como você quer abastecer?\n1 - Valor\n2 - Litros");
                int medida = s.nextInt();
    
                if(medida == 1){
                    System.out.println("Quantos reais você quer abastecer?");
                    double valor = s.nextDouble();
                    bomba1.abastValor(valor);
                    System.out.println("Restam " + bomba1.getQntComb() + " litros na bomba.");
                }
                else if(medida == 2){
                    System.out.println("Quantos litros você quer abastecer?");
                    double litros = s.nextDouble();
                    bomba1.abastLitro(litros);
                    System.out.println("Restam " + bomba1.getQntComb() + " litros na bomba.");
                }
                else{
                    System.out.println("Entrada inválida. Tente novamente.");
                }
    
            }
            else{
                System.out.println("Entrada inválida. Tente novamente.");
            }
    
            s.close();

        }
        
        
    }


}
