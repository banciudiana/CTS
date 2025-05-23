package Composite.Colet.clase;

import Adapter.Universitate.clase.INotaFinala;

public interface INod {

    // add streg get
    float getGreutate();
    boolean isFragil();
    void adaugaNod(INod nod);
    void stergeNod(INod nod);
    INod getNod(int index);
}
