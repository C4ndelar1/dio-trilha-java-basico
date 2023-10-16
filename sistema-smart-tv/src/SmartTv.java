public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 10;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void selecionarCanal(int NovoCanal){
        canal = NovoCanal;
    }

    public void aumentarCanalPorMaisUm(){
        canal++;
    }

    public void diminuirCanalPorMenosUm(){
        canal--;
    }

    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }
}
