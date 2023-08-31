package projeto_iPhone.iPhone;


import projeto_iPhone.devices.NavegadorInternet;
import projeto_iPhone.devices.ReprodutorMusical;
import projeto_iPhone.devices.Telefone;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class SmartPhoneApple  implements Telefone, NavegadorInternet, ReprodutorMusical {
    public String iPhone;

    public void tocarMusica() {
        System.out.println("TOCANDO");
    }

    public void pausar(){
        System.out.println("PAUSANDO");
    }
    public void selecionarMusica(){
        System.out.println("SELECIONANDO MÚSICA");
    };

    public void ligar() {
        System.out.println("LIGANDO");
    }

    public void atender() {
        System.out.println("ATENDENDO");
    }

    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");
    }

    public void exibirPagina() {
        System.out.println("EXIBINDO PÁGINA");
    }

    public void iniciarNovaAba() {
        System.out.println("ABRINDO NOVA ABA");
    }

    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PÁGINA");
    }

    public void voltarpagina() {
        System.out.println("VOLTANDO PÁGINDA");
    }

    public void avancarPagina() {
        System.out.println("AVANÇANDO PÁGINA");
    }
}

