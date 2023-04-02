package FactoryMethod;

public class FactoryPachetCazareTransport implements Factory{
    @Override
    public PachetTuristic crearePachet() {
        return new PachetCazareTransport();
    }
}
