package Composite.Colet.clase;

public class Colet implements INod{
    private float greutate;
    private boolean isFragil;

    public Colet( float greutate,boolean isFragil) {
        this.isFragil = isFragil;
        this.greutate = greutate;
    }

    @Override
    public float getGreutate() {
        return greutate;
    }

    @Override
    public boolean isFragil() {
        return isFragil;
    }

    @Override
    public void adaugaNod(INod nod) {
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
}
