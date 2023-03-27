package FactoryMethod;

public class DogFactory implements AnimalFactory<Dog>{
    @Override
    public Dog creareAnimal() {
        return new Dog();
    }
}
