package FactoryMethod;

public class FactoryPachetCazare implements Factory{
    @Override
    public PachetTuristic crearePachet() {
        return new PachetCazare();
    }
}
