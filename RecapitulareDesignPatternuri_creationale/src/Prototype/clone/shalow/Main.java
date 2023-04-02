package Prototype.clone.shalow;

public class Main {
    public static void main (String[]args)
    {
        ColorStore.getColor("blue").addColor();
        ColorStore.getColor("black").addColor();
        ColorStore.getColor("black").addColor();
    }
}
