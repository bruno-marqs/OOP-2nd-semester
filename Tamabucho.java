import java.util.Scanner;

public class Tamabucho {
    private String nome;
    private int fome;
    private int saude;
    private int idade;

    public Tamabucho(String nome, int fome, int saude, int idade){
        this.nome = nome;
        this.fome = fome;
        this.saude = saude;
        this.idade = idade;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFome(int fome) {
        this.fome = fome;
    }

    public void setSaude(int saude) {
        this.saude = saude;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getFome() {
        return fome;
    }

    public int getSaude() {
        return saude;
    }

    public int getIdade() {
        return idade;
    }

    public double humor(){
        double mood = (fome + saude) / 2;
            if (mood == 0) {
                System.out.println(nome + " está com humor " + mood + "\nEle morreu!");
            }
            
            else if (mood == 100){
                System.out.println(nome + " está com humor " + mood + "\nEle tá ótimo!");
            }

            else{
                System.out.println(nome + " está com humor " + mood + "\nDê mais atenção à ele");
            }
        return mood;
    }

    public static void main(String[] args) {
        System.out.println("Dê um nome ao seu bicho: ");
        Scanner s = new Scanner(System.in);
        String nome = s.next();
        s.close();

        Tamabucho bicho1 = new Tamabucho(nome, 100, 100, 1);
        
        System.out.println("Seu Tamabucho chamado " + nome + "irá começar com 01 ano de idade\ne Fome e Saúde completos.");

        // teste da classe

        System.out.println("O nome de seu Tamabucho é " + bicho1.getNome() + " e tem " + bicho1.getIdade() + " anos");
        System.out.println(bicho1.getNome() + " está com saúde de " + bicho1.getSaude() + " e fome de " + bicho1.getFome());
        System.out.println(bicho1.humor()); 
        bicho1.setFome(40);
        bicho1.setSaude(40);
        System.out.println(bicho1.getNome() + " está com saúde de " + bicho1.getSaude() + " e fome de " + bicho1.getFome());
        bicho1.humor();
        bicho1.setFome(20);
        bicho1.setSaude(20);
        System.out.println(bicho1.getNome() + " está com saúde de " + bicho1.getSaude() + " e fome de " + bicho1.getFome());
        bicho1.humor();
        bicho1.setFome(0);
        bicho1.setSaude(0);
        System.out.println(bicho1.getNome() + " está com saúde de " + bicho1.getSaude() + " e fome de " + bicho1.getFome());
        bicho1.humor();
    }
}
