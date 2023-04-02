package Probleme.factoryMethod;

public class FactoryBrancardier implements Factory{
    @Override
    public Personal crearePersonal() {
        return new Brancardier();
    }
}
