package FactoryMethod;

public class FactoryPachetAllInclusive implements Factory{
    @Override
    public PachetTuristic crearePachet() {
        return new PachetAllInclusive();
    }
}
