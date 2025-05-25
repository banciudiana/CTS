package Proxy.Petrecere.clase;

import java.util.ArrayList;
import java.util.List;

public class Petrecere implements IPetrecere {
    private String data;
    private List<String> listaInvitatie;
    private List<Client> listaParticipanti;

    public Petrecere(String data,List<String> listaInvitatie){
        super();
        this.data=data;
        this.listaInvitatie=listaInvitatie;
        this.listaParticipanti=new ArrayList<>();
    }


    @Override
    public void aduagaParticipanti(Client cl) {
        this.listaParticipanti.add(cl);
        System.out.println("clientul " + cl + "a fost adaugat la petrecere");
    }

    @Override
    public void afisareProgram() {

    }
}
