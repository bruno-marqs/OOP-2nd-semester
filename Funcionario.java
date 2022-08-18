public class Funcionario {
  private String nome;
  private double salario;
  private double percent;

  public Funcionario(String nome, double salario, double percent){
    this.nome = nome;
    this.salario = salario;
    this.percent = percent;
  }

  public String getNome(){
    return this.nome;
  }

  public double getSalario(){
    return this.salario;
  }

  public double getPercent() {
      return percent;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setSalario(double novoSalario){
    this.salario = novoSalario;
  }

  public void setPercent(double novoPercent) {
      this.percent = novoPercent;
  }

  public void aumento(){
    this.salario += this.salario * this.percent / 100;
  }

  public static void main(String[] args) {
    Funcionario func1 = new Funcionario("Kelvin", 3500, 10);
    System.out.println(func1.getNome());
    System.out.println(func1.getSalario());
    System.out.println(func1.getPercent());
    func1.aumento();
    System.out.println(func1.getSalario());
    func1.aumento();
    System.out.println(func1.getSalario());
    func1.setPercent(15);
    System.out.println(func1.getPercent());
    func1.aumento();
    System.out.println(func1.getSalario());

  }
}
