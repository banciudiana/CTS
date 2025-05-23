package Composite.CompositeCurs.clase;

public class Item implements IOptiune {
    private String nume;

    public Item(String nume) {
        this.nume = nume;
    }

    @Override
    public void stergeNod(IOptiune optiune) throws Exception {
        throw new Exception ("Nu este implementata");
    }

    @Override
    public void adaugaNod(IOptiune optiune) throws Exception {
        throw new Exception ("Nu este implementata");
    }

    @Override
    public IOptiune getNod(int index) throws Exception {
        throw new Exception ("Nu este implementata");
    }

    @Override
    public void descriere() {
        System.out.println("     Item  "+ nume);
    }
}
