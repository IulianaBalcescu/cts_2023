package Probleme.factoryMethod;

public class FactoryAsistent implements Factory{
    @Override
    public Personal crearePersonal() {
        return new Asistent();
    }
}
