package Adapter.Universitate.clase;

public class UniversitateaB implements IEvaluareInstitutB{
    @Override
    public double evalueazaStudent(double punctajExamene,double punctajProiecte) {
        System.out.println("Univ B");
        return (punctajExamene+ punctajProiecte)/2;

    }
}
