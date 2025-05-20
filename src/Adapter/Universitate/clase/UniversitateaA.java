package Adapter.Universitate.clase;

public class UniversitateaA implements INotaFinala {

    @Override
    public double calculeazaNotaFinala(Student student) {
        System.out.println("Univ A");
        return student.getPunctajExamene()*0.75 + student.getPunctajProiecte()*0.25;
    }
}
