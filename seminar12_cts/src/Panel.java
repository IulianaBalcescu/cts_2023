import java.util.ArrayList;
import java.util.List;

public class Panel implements Component{

    private List<Component>componente=new ArrayList<>();

    public void adaugaComponenta(Component componenta){
        componente.add(componenta);
    }
    public void eliminaComponenta(Component componenta){
        componente.remove(componenta);
    }
    @Override
    public void rander() {
        System.out.println("Se afiseaza panoul");

        for(Component componenta:componente){
            componenta.rander();
        }
    }
}
