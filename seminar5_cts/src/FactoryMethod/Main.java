package FactoryMethod;

public class Main {
    public static void main(String[] args){
        AnimalFactory<Dog> animalFactory1;
        AnimalFactory<Cat> animalFactory2;
        animalFactory1=new DogFactory();
        animalFactory2=new CatFactory();

        Animal dog=animalFactory1.creareAnimal();
        Animal cat=animalFactory2.creareAnimal();

    }
}
