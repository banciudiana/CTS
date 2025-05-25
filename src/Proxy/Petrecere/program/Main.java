package Proxy.Petrecere.program;

import Proxy.Petrecere.clase.Client;
import Proxy.Petrecere.clase.IPetrecere;
import Proxy.Petrecere.clase.Petrecere;
import Proxy.Petrecere.clase.ProxyPetrecere;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listaInvitati = new ArrayList<>();
        listaInvitati.add("Mos Craciun");
        listaInvitati.add("Renul Rudolf");

        Client cl1 = new Client("Gigel", 20);
        Client cl2 = new Client("Costel", 12);
        Client cl3 = new Client("Marcel", 20);
        Client cl4 = new Client("Ionela", 12);

        IPetrecere petrecere = new Petrecere("24.12.2022", listaInvitati);
        petrecere.aduagaParticipanti(cl1);

        IPetrecere petrecereProxy = new ProxyPetrecere(petrecere);
        petrecereProxy.aduagaParticipanti(cl3);
        petrecereProxy.aduagaParticipanti(cl4);
    }
}
