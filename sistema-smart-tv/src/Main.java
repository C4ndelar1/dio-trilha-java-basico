public class Main {
    public static void main(String[] args) {

        SmartTv novaTv = new SmartTv();

        //Alterar canal +1
        System.out.println("Seu canal atual é: " + novaTv.canal);
        novaTv.aumentarCanalPorMaisUm();
        System.out.println("Seu canal foi alterado para: " + novaTv.canal);

        //Diminuir canal -1
        System.out.println("Seu canal atual é: " + novaTv.canal);
        novaTv.diminuirCanalPorMenosUm();
        System.out.println("Seu canal foi alterado para: " + novaTv.canal);

        //Selecionar canal qualquer
        System.out.println("Seu canal atual é: " + novaTv.canal);
        novaTv.selecionarCanal(25);
        System.out.println("Seu canal foi alterado para: " + novaTv.canal);

        //Diminuir volume -1
        System.out.println("Seu volume atual é: " + novaTv.volume);
        novaTv.aumentarVolume();
        System.out.println("Seu volume foi alterado para: " + novaTv.canal);

        //Aumentar volume +1
        System.out.println("Seu volume atual é: " + novaTv.canal);
        novaTv.diminuirVolume();
        System.out.println("Seu canal foi alterado para: " + novaTv.canal);

        //ligar TV
        novaTv.ligar();
        if (novaTv.ligada == true){
            System.out.println("Sua TV está sendo ligada!");
        }

        //desligar TV
        novaTv.desligar();
        System.out.println("Sua TV está sendo desligda");
    }
}