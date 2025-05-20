package Adapter.Universitate.program;

import Adapter.Universitate.clase.Adapter;
import Adapter.Universitate.clase.IEvaluareInstitutB;
import Adapter.Universitate.clase.Student;
import Adapter.Universitate.clase.UniversitateaB;

public class Main {
    public static void main(String[] args) {


        System.out.println("Univ B inainte de schimbare");
        Student studentB=new Student("George",5,6);
        IEvaluareInstitutB evaluareInstitutB=new UniversitateaB();
        System.out.println(evaluareInstitutB.evalueazaStudent(5,6));

        System.out.println("\n\nDupa");
        IEvaluareInstitutB evaluareInstitutB2=new Adapter();
        System.out.println(evaluareInstitutB2.evalueazaStudent(5,6));
    }
}
