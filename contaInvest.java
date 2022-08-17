public class contaInvest {
    private int num;
    private String nome;
    private double saldo;
    private double juros;

    public contaInvest(int num, String nome, double saldo, double juros){
    this.num = num;
    this.nome = nome;
    this.saldo = saldo;
    this.juros = juros;
    }

    public String getNome() {
        return nome;
    }

    public int getNum() {
        return num;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setJuros(double novoJuros){
        this.juros = novoJuros;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){
        if (this.saldo == 0 || this.saldo < valor){
            System.out.println("Saldo insuficiente. Procure um gerente.");
        }
        else{
            this.saldo = this.saldo - valor;
        }
    }

    public void addJuros(){
        this.saldo += this.saldo * this.juros/100;
    }

    public static void main(String[] args){
        contaInvest inv1 = new contaInvest(4875, "Kelvin", 1000, 10);
        System.out.println(inv1.getSaldo());
        System.out.println(inv1.getNome());
        System.out.println(inv1.getNum());
        inv1.addJuros();
        inv1.addJuros();
        inv1.addJuros();
        inv1.addJuros();
        inv1.addJuros();
        System.out.println(inv1.getSaldo());
    }
}
