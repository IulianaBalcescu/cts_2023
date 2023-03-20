public class Server {
    int port;
    String name;



    private static Server instanta = null;
    private Server(int port, String name){
        this.port=port;
        this.name=name;
    }

    public int getPort(){
        return port;
    }

    public void setPort(int Port)
    {
        this.port=port;
    }

    public String getName()
    {
        return name;
    }

    public void setname(String name)
    {
        this.name=name;
    }

    public String showStatus()
    {
        return ("Serverul "+ this.name+" ruleaza pe portul "+this.port);
    }
    public static synchronized Server getInstance(int port, String name)
    {
        if(instanta==null)
            instanta=new Server(port, name);
        return instanta;
    }
}