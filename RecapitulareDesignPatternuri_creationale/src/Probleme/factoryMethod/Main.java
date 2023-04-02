package Probleme.factoryMethod;

public class Main {
    public static void afisare(Factory factory){
        Personal personal=factory.crearePersonal();
        personal.descriere();
    }
    public static void main(String[]args)
    {
        /*
        * 3. În cadrul aplicației personalul spitalului este de mai multe tipuri: Brancardier, Asistent, Medic.
            Să se implementeze modulul care pune la dispoziției crearea de obiecte din familia obiectelor
            PersonalSpital. Modulul trebuie realizat, astfel încât pentru adăugări de noi tipuri de personal să
            nu fie necesare modificări în codul existent.

        *
        * */

        afisare(new FactoryBrancardier());
        afisare(new FactoryAsistent());
    }
}
