package Adapter.LogiTrans.clase;

public class RouteDetails {
    private int total;
    private double km;

    public RouteDetails(int total, double km) {
        this.total = total;
        this.km = km;
    }

    public int getTotal() {
        return total;
    }

    public double getKm() {
        return km;
    }

    @Override
    public String toString() {
        return "RouteDetails{" +
                "total=" + total +
                ", km=" + km +
                '}';
    }
}
