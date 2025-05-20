package Adapter.Universitate.clase;

public class Adapter implements IEvaluareInstitutB{
    private UniversitateaA universitateaNoastra;

    public Adapter() {
        this.universitateaNoastra = new UniversitateaA();
    }

    @Override
    public double evalueazaStudent(double punctajExamene, double punctajProiecte) {
        System.out.println("Se pare ca intra la B dar de fapt");
        return universitateaNoastra.calculeazaNotaFinala(new Student("Vladimir",punctajExamene,punctajProiecte));
    }
}
