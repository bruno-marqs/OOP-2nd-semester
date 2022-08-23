import java.util.List;
import java.util.ArrayList;

public class Macaco2 {
    private String nome;
    private List<String> estomago;

    public Macaco2(String nome){
        this.nome = nome;
        estomago = new ArrayList<String>();
    }

    public void comer(String item){
        estomago.add(item);
    }

    public void verEstomago(){
        System.out.println(estomago.toString());
    }

    public void digerir(){
        estomago.remove(0);
    }

    public static void main(String[] args) {
        Macaco2 monk1 = new Macaco2("Brutos");
        monk1.comer("uva");
        monk1.comer("geleia");
        monk1.comer("pastel");
        monk1.verEstomago();
        monk1.comer("coxinha");
        monk1.comer("caldo de cana");
        monk1.verEstomago();
        monk1.digerir();
        monk1.digerir();
        monk1.verEstomago();
        monk1.comer("Sanduiche");
        monk1.comer("Açai");
        monk1.verEstomago();

    }

    
}
