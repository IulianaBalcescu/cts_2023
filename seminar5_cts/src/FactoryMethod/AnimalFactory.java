package FactoryMethod;

public interface AnimalFactory<T extends Animal> {
    T creareAnimal();

}
