package projeto_iPhone;

import projeto_iPhone.devices.NavegadorInternet;
import projeto_iPhone.devices.ReprodutorMusical;
import projeto_iPhone.devices.Telefone;
import projeto_iPhone.iPhone.SmartPhoneApple;

import java.util.NavigableMap;

public class Main {
    public static void main(String[] args) {
        SmartPhoneApple iPhone = new SmartPhoneApple();
        ReprodutorMusical reprodutorMusical = iPhone;
        Telefone telefone = iPhone;
        NavegadorInternet navegadorInternet = iPhone;

        reprodutorMusical.selecionarMusica();
        reprodutorMusical.tocarMusica();
        reprodutorMusical.pausar();

        telefone.atender();
        telefone.ligar();
        telefone.iniciarCorreioVoz();

        navegadorInternet.exibirPagina();
        navegadorInternet.iniciarNovaAba();
        navegadorInternet.avancarPagina();
        navegadorInternet.voltarpagina();
    }
}
