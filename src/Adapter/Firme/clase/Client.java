package Adapter.Firme.clase;

public class Client {
    private String nume;
    private double totalAchizitie;

    public Client(String nume, double totalAchizitie) {
        this.nume = nume;
        this.totalAchizitie = totalAchizitie;
    }

    public String getNume() {
        return nume;
    }

    public double getTotalAchizitie() {
        return totalAchizitie;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", totalAchizitie=" + totalAchizitie +
                '}';
    }
}
