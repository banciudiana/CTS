package Adapter.LogiTrans.program;

import Adapter.LogiTrans.clase.*;

public class Main {
    public static void main(String[] args) {
        Client client=new Client("a",5, TipLivrare.CURIER);
        //inainte

        IRutaStandard rutaStandard=new LogiTrans();
        System.out.println(rutaStandard.getRutaStandard(client));
        IRutaStandard rutaStandard1=new Adapter();
        System.out.println(rutaStandard1.getRutaStandard(client));
    }
}
