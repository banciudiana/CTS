package Facade.Hotel.clase;

public class Facade {

    public static boolean verificareCamera (int cod){
        CamereLibere libere=new CamereLibere();
        if(libere.verificareCameraLibera(cod) ){
            Menajera menajera=new Menajera();
            if( menajera.esteCameraCuratat(cod) && menajera.areProsoapeNoi(cod)) {
                System.out.println("Camera este gata");
                return true;
            } else {
                System.out.println("Camera nu este gata");
            }
        } else{
            System.out.println("Asteptati sa se elibereze camera");
        }

        return false;
    }


}
