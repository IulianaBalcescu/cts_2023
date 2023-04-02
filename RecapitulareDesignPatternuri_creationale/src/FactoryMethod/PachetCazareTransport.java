package FactoryMethod;

public class PachetCazareTransport implements PachetTuristic{
    @Override
    public void descriere() {
        System.out.println("Acest pachet include cazare si transport");
    }
}
