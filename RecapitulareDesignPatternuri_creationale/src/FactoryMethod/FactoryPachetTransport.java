package FactoryMethod;

public class FactoryPachetTransport implements Factory{
    @Override
    public PachetTuristic crearePachet() {
        return new PachetTransport();
    }
}
