package Facade.Restaurant.clase;

public class Ospatar {
    private boolean isOcupat;
    private String nume;

    public Ospatar(boolean isOcupat, String nume) {
        this.isOcupat = isOcupat;
        this.nume = nume;
    }

    public boolean isOcupat() {
        return isOcupat;
    }

    public void setOcupat(boolean ocupat) {
        isOcupat = ocupat;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}
