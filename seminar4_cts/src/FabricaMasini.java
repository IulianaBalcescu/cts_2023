public class FabricaMasini {
    String model;
    int id;

    private static FabricaMasini instance;

    private FabricaMasini()
    {
        model = null;
        id=0;
    }

    public FabricaMasini(String model, int id) {
        this.model = model;
        this.id = id;
    }

    public static synchronized  FabricaMasini getInstance(String model,int id)
    {
        if(instance==null){
            instance = new FabricaMasini(model,id);
            return instance;
        }
        return instance;
    }



    public String showStatus()
    {
        return "Masina are id-ul " + id +" si modelul " +model;
    }

}
