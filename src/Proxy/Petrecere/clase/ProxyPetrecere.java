package Proxy.Petrecere.clase;

public class ProxyPetrecere implements IPetrecere{
    private IPetrecere petrecere;

    public ProxyPetrecere(IPetrecere petrecere) {
        super();
        this.petrecere = petrecere;
    }


    @Override
    public void aduagaParticipanti(Client cl) {
        if(cl.getVarsta()>=18){
            petrecere.aduagaParticipanti(cl);
        }
        else {
            System.out.println("Clientul " +  cl.getName() + " nu are varsta minima ptr petrecere ");
        }
    }

    @Override
    public void afisareProgram() {
            this.petrecere.afisareProgram();
    }
}
