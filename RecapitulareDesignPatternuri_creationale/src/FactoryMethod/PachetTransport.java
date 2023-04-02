package FactoryMethod;

public class PachetTransport implements PachetTuristic{
    @Override
    public void descriere() {
        System.out.println("Acest pachet include dpar transport");
    }
}
