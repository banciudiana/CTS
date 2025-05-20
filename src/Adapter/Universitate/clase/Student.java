package Adapter.Universitate.clase;

public class Student {
    private String nume;
    private double punctajExamene;
    private double punctajProiecte;

    public Student(String nume, double punctajExamene, double punctajProiecte) {
        this.nume = nume;
        this.punctajExamene = punctajExamene;
        this.punctajProiecte = punctajProiecte;
    }

    public String getNume() {
        return nume;
    }

    public double getPunctajExamene() {
        return punctajExamene;
    }

    public double getPunctajProiecte() {
        return punctajProiecte;
    }
}
