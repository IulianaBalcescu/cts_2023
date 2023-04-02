package FactoryMethod;

public class Main {

    private static void afisare(Factory fabrica){
        PachetTuristic pachetTuristic=fabrica.crearePachet();
        pachetTuristic.descriere();
    }
    public static void main (String[] args)
    {
        afisare(new FactoryPachetAllInclusive());
       // afisare(new FactoryPachetCazare());
    }
}
/*
* Să se implementeze modulul de vânzare de pachete turistice pentru
agenția AgeTur, știindu-se faptul că această oferă pachete din familia
pachetelor turistice. Să nu se utilizeze tipuri enum.
* */