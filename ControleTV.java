public class ControleTV {
    private int canal;
    private int volume;

    public ControleTV(int canal, int volume){
    this.canal = canal;
    this.volume = volume;
    }

    public int getCanal(){
        return canal;
    }

    public int getVolume(){
        return volume;
    }

    public void setCanal(int novoCanal){
        if (0 <= novoCanal && novoCanal <= 100){
            this.canal = novoCanal;
        }
        else{
            System.out.println(String.format("Não há canal nesta banda"));
        }
    }

    public void menosVolume(){
        if (1 < this.volume && this.volume < 100){
            this.volume -= 1;
        }
        else if (this.volume == 0){
            System.out.println(String.format("O volume está mudo"));
        }
        else{
            System.out.println("Esta não é uma faixa de volume válida");
        }
    }

    public void maisVolume(){
        if (1 < this.volume && this.volume < 100){
            this.volume += 1;
        }
        else if (this.volume == 100){
            System.out.println("O volume está no máximo");
        }
        else{
            System.out.println("Esta não é uma faixa de volume válida");
        }
    }

    public static void main(String[] args) {
        ControleTV ctrl = new ControleTV(50, 25);
        System.out.println(ctrl.getCanal());
        System.out.println(ctrl.getVolume());
        ctrl.setCanal(5);
        System.out.println(ctrl.getCanal());
        ctrl.maisVolume();
        ctrl.maisVolume();
        ctrl.maisVolume();
        System.out.println(ctrl.getVolume());
        ctrl.menosVolume();
        System.out.println(ctrl.getVolume());
    }
}
