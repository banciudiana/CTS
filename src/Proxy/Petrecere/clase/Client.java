package Proxy.Petrecere.clase;

public class Client {
    private String name;
    private int varsta;

    public Client(String name, int varsta) {
        this.name = name;
        this.varsta = varsta;
    }

    public String getName() {
        return name;
    }

    public int getVarsta() {
        return varsta;
    }
}
