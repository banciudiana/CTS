package Facade.AgentieTurism.clase;

public class Hotel {
    private String numeHotel;

    public Hotel(String numeHotel) {
        this.numeHotel = numeHotel;
    }

    public String getNumeHotel() {
        return numeHotel;
    }

    public void setNumeHotel(String numeHotel) {
        this.numeHotel = numeHotel;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "numeHotel='" + numeHotel + '\'' +
                '}';
    }

    public void rezervaCamera(String oras){
        System.out.println("s a rezervat o camera in  hotelul " + this.numeHotel + " in orasul " + oras);
    }
}
