package aparelho;

import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorInternet;
import funcionalidades.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {


    @Override
    public void ligar() {
        System.out.println("O aparelho foi ligado!");

    }

    @Override
    public void atender() {
        System.out.println("A ligação foi atendida!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("O correio de voz foi iniciado!");
    }

    @Override
    public void exibirPagina() {
        System.out.println("A página está sendo exibida!");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Uma nova aba foi adicionada!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("A página foi atualizada!");
    }

    @Override
    public void tocar() {
        System.out.println("A música está tocando!");
    }

    @Override
    public void pausar() {
        System.out.println("A música foi pausada!");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecione sua música!");
    }
}
