package usuario;

import aparelho.Iphone;

public class Usuario extends Iphone {

    public static void main(String[] args) {
        Iphone novoIphone = new Iphone();
        //ligar para alguém
        novoIphone.ligar();
        //atender a ligação
        novoIphone.atender();
        //acessar o correio de voz
        novoIphone.iniciarCorreioVoz();
        //tocar uma música
        novoIphone.tocar();
        //pausar a música
        novoIphone.pausar();
        //selecionar uma música
        novoIphone.selecionarMusica();
        //exibir página da internet
        novoIphone.exibirPagina();
        //adicionar aba do navegador
        novoIphone.adicionarNovaAba();
        //atualizar página da internet
        novoIphone.atualizarPagina();
    }
}
