package Composite.Angajati.clase;

public class Angajat implements INod{
     String nume;
     Double salariu;

    public Angajat(String nume, Double salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }


    @Override
    public double getSalariu() {
        return this.salariu;
    }

    @Override
    public void displayInfo() {
        System.out.println(" Angajatul " + nume + " are salariul " + salariu);
    }

    @Override
    public void addNod(INod nod) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergeNod(INod nod) {
        throw new UnsupportedOperationException();
    }

    @Override
    public INod getNod(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getNrAngajati() {
        throw  new UnsupportedOperationException();
    }
}
