package SimpleFactory;

public class Main {
    public static void main(String[] args) {
       Pizza cheesePizza=PizzaFactory.crearePizza(PizzaType.Cheese);
       Pizza peperoniPizza=PizzaFactory.crearePizza(PizzaType.Peperoni);
       Pizza quatroStagioniPizza=PizzaFactory.crearePizza(PizzaType.Quatro_Stagioni);
    }
}