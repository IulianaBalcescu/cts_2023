package SimpleFactory;

public class PizzaFactory {
    public static Pizza crearePizza(PizzaType pizzaType){
        switch (pizzaType){
            case Cheese -> new CheesePizza();
            case Peperoni -> new PeperoniPizza();
            case Quatro_Stagioni -> new QuatroStagioniPizza();
        }
        return null;
    }
}
