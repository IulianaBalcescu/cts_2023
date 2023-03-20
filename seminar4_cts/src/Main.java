public class Main {
    public static void main(String[] args) {

        Server server2=Server.getInstance(8081, "Server 2");
        Server server1=Server.getInstance(443, "Server 1");
        System.out.println(server2.showStatus());

        
        System.out.println(server2.getName());
        System.out.println(server1.getName());

        FabricaMasini fabricaMasini1= FabricaMasini.getInstance("Dacia",1);
        System.out.println(fabricaMasini1.showStatus());
    }
}

/*O fabrica de masini care implementeaza un sistem centralizat de monitorizare a productiei. Sistemul trebuie sa asigure adaugarea si modificarea
datelor despre masinile fabricate la nivelul sediului central, intr un mediu securizat (sistemul va exista sub forma unui sever dispus in datatcenter ul din HQ).
Programatorii trebuie sa se asigure ca sistemul nu va putea fi replicat si ca toate datele vor fi manageriate prin intermediul singurului server
mentionat anterior*/