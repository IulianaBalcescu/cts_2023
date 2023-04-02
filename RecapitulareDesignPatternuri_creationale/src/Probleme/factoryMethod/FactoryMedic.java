package Probleme.factoryMethod;

public class FactoryMedic implements Factory{
    @Override
    public Personal crearePersonal() {
        return new Medic();
    }
}
