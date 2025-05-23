package Composite.Angajati.clase;

public interface INod {
    public double getSalariu();
    public void displayInfo();
    public void addNod(INod nod);
    public void stergeNod(INod nod);
    public INod getNod(int index);
    public int getNrAngajati();
}
