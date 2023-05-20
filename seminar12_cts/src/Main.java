public class Main {
    public static void main(String[] args) {
       //creaza componentele
        Component buton1=new Button();
        Component buton2=new Button();
        Component campText=new TextField();

        //creaza un panou si adauga componente
        Component panou=new Panel();
        ((Panel) panou).adaugaComponenta(buton1);
        ((Panel) panou).adaugaComponenta(buton2);
        ((Panel) panou).adaugaComponenta(campText);

        panou.rander();
    }
}