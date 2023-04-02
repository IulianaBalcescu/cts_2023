package Probleme.singleton;

public class Fabrica {
    private String denumireFabrica;
    private int  port;
    private static Fabrica instanta=null;

    private Fabrica(String denumireFabrica, int port) {
        this.denumireFabrica = denumireFabrica;
        this.port = port;
    }

    public String getDenumireFabrica() {
        return denumireFabrica;
    }

    public void setDenumireFabrica(String denumireFabrica) {
        this.denumireFabrica = denumireFabrica;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public static synchronized  Fabrica getInstanta(String denumireFabrica, int port) {
        if(instanta==null){
            instanta=new Fabrica(denumireFabrica,port);
        }
        return instanta;
    }

    public String showStatus(){
        return ("Fabrica "+denumireFabrica+ " are servarul "+port);
    }

}
