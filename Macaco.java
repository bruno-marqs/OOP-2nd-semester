import java.util.Arrays;

public class Macaco{
    private String nome;
    private String[] estomago;

    public Macaco(String nome){
        this.nome = nome;
        estomago = new String[5];
    }

    public void comer(String item){
        boolean cheio = true;
        for(int i = 0; i < estomago.length; i++){
            if(estomago[i] == null){
                estomago[i] = item;
                cheio = false;
                break;
            }
        }
        if(cheio){
            System.out.println("Estomago cheio");
        }

    }

    public void verEstomago(){
       System.out.println(Arrays.toString(estomago));
    }

    public void digerir(){
        boolean vazio = true;
        for(int i = 0; i < estomago.length; i++){
            if(estomago[i] != null){
                estomago[i] = null;
                vazio = false;
                break;
            }
        }
        if(vazio){
            System.out.println("O estomago esta vazio");
        }
    }

    public static void main(String[] args) {
        Macaco monk1 = new Macaco("Golias");
        Macaco monk2 = new Macaco("Tobias");
        monk1.comer("uva");
        monk1.comer("jabuticaba");
        monk1.comer("jujuba");
        monk1.verEstomago();
        monk2.comer("Pititinga");
        monk2.comer("Lambreta");
        monk2.comer("Amstel");
        monk2.comer("Queijo Coalho");
        monk2.comer("Heinenkein");
        monk2.verEstomago();
        monk2.comer("Estomazil");
    }
}