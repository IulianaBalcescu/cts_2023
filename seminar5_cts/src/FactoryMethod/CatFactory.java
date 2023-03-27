package FactoryMethod;

public class CatFactory implements AnimalFactory<Cat>{
    @Override
    public Cat creareAnimal() {
        return new Cat();
    }
}
