package Facade.Restaurant.clase;

public class Facade {
    RegistruBucatari registruBucatari=new RegistruBucatari();
    RegistruOspatari registruOspatari=new RegistruOspatari();

    public void addBucatar(Bucatar b){
        registruBucatari.addBucatar(b);
    }

    public void addOspatar(Ospatar o)
    {
        registruOspatari.addOspatar(o);
    }

    public boolean estePosibilComanada( String data , int nrPers){
        int contorBucatari= registruBucatari.getNrBucatariDisponibili(data);
        int contorOspatari= registruOspatari.getNrOspatariDisponibili(data);

        if( contorOspatari >= nrPers/5 && contorBucatari >= nrPers/20){
            return true;
        }
        else return false;
    }
}
