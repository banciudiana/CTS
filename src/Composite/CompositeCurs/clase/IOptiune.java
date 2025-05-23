package Composite.CompositeCurs.clase;

import javax.swing.tree.ExpandVetoException;

public interface IOptiune {
    // ce trebuie sa aiba orice nod
    void stergeNod(IOptiune optiune) throws Exception;
    void adaugaNod(IOptiune optiune) throws Exception;
    IOptiune getNod(int index) throws Exception;

    // met specifice ex
    void descriere();
}
