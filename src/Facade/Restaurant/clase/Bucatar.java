package Facade.Restaurant.clase;

public class Bucatar {
    private String nume;
    private boolean esteOcupat;

    public Bucatar(String nume, boolean esteOcupat) {
        this.nume = nume;
        this.esteOcupat = esteOcupat;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public boolean isEsteOcupat() {
        return esteOcupat;
    }

    public void setEsteOcupat(boolean esteOcupat) {
        this.esteOcupat = esteOcupat;
    }

    @Override
    public String toString() {
        return "Bucatar{" +
                "nume='" + nume + '\'' +
                ", esteOcupat=" + esteOcupat +
                '}';
    }
}
