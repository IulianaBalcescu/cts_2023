package Probleme.singleton;

public class Main {
    public static void main(String[]args)
    {
        /*O fabrica de masini care implementeaza un sistem centralizat de monitorizare a productiei. Sistemul trebuie sa asigure adaugarea si modificarea
        datelor despre masinile fabricate la nivelul sediului central, intr -un mediu securizat (sistemul va exista sub forma unui sever dispus in datatcenter ul din HQ).
        Programatorii trebuie sa se asigure ca sistemul nu va putea fi replicat si ca toate datele vor fi manageriate prin intermediul singurului server
        mentionat anterior*
        */

        Fabrica fabrica=Fabrica.getInstanta("Masini SRL",8081);
        System.out.println(fabrica.showStatus());
    }
}
