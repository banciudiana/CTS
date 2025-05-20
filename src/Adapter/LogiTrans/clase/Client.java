package Adapter.LogiTrans.clase;

public class Client {
    private String adresa;
    private int greutateColet;
    private TipLivrare tipLivrare;

    public Client(String adresa, int greutateColet, TipLivrare tipLivrare) {
        this.adresa = adresa;
        this.greutateColet = greutateColet;
        this.tipLivrare = tipLivrare;
    }

    public String getAdresa() {
        return adresa;
    }

    public int getGreutateColet() {
        return greutateColet;
    }

    public TipLivrare getTipLivrare() {
        return tipLivrare;
    }
}
