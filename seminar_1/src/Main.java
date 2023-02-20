import java.util.ArrayList;
//modificari ca si tema
public class Main {

    public static void main(String[] args) {
        // write your code here
        OShop o = new OShop("Emag", "logo.jpg", new ArrayList<Prod>());

        Prod p1 = new Prod("Laptop", 3200.5, 1,1, 1123, "");
        Prod p2 = new Prod("Frigider", 207.95, 1,2, 1245, "");

        Prod p3 = new Prod(p1);

        p3.setQty(5);
        p3.setName("Paine");

        o.modifyProductsList(1,p1);
        o.modifyProductsList(1,p2);

        o.modifyProductsList(2, p1);
        System.out.println(p1.isEquals(p2));
    }
}

class OShop {
    private String onlineShopName;
    private String i;
    private ArrayList<Prod> products;

    OShop(String name, String img, ArrayList<Prod> products)
    {
        this.products = new ArrayList<Prod>();
        this.i = img;
        this.onlineShopName = name;
    }

    public void modifyProductsList(int what, Prod p)
    {
        if(what == 1)
        {
            this.products.add(p);
        }
        else
            this.products.remove(p);
    }

    public String getOnlineShopName() {
        return onlineShopName;
    }

    public void setOnlineShopName(String onlineShopName) {
        this.onlineShopName = onlineShopName;
    }

    public String getI() {
        return i;
    }

    public void setImg(String img) {
        this.i = img;
    }
}

class Prod
{
    private int id;
    private String name;
    private double price;
    private int type;
    private int category;
    private int qty;
    private String exp; //expiry date - only for goods
    private String details; // ex.: processor, memory, power, volume (for refrigerators etc)

    public Prod(String n, double p, int pt, int pc, int id, String exp)
    {//nu au nume sugestive
        //denumim ca variabilele membre si punem this
        //in partea de implementare: fie precizam ca e vorba de this ,fie nu specificam
        name = n;
        price = p;
        type = pt;
        category = pc;
        this.id = id;
        this.exp = exp;
    }

    public Prod(Prod p)
    {
        //sa schimbam  numele parametrilor
        //sa facem o copie ??
        this.name = p.name;
        this.price = p.price;
        this.type = p.type;
        this.category = p.category;
        this.id = p.id;
    }

    //schimbam denumirea
    public double getPrice() {
        return price;
    }

    public void setProductPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String prodName) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    //equals nu e sugestiv,trebuie sa stim ce comparam ,deci schimbam denumirea variabilei


    //1 . specificam ce variabile comparam,facem un boolean de true sau false
    //2. comparam element cu element
    public boolean isEquals(Prod p)
    {
        if(p.id != this.id && p.name !=this.name && p.price !=this.price &&p.type !=this.type && p.category !=this.category) {
            return false;
        }
            else {
            return true;
        }
//        if(!p.prodName.equals(this.prodName))
//            return false;
//        if(p.productPrice != this.productPrice)
//            return false;
//        if(p.productType != p.productType)
//            return false;
//        if(p.productCategory != this.productCategory)
//            return false;
//
//        return true;
    }
//    public void modify(boolean flag, double val)
//    {
//        if(flag)
//            this.price+=this.price*val;
//        if(!flag)
//            this.price-=this.price*val/100;
//    }
    public  void add(boolean flag, double val){
        if(flag)
            this.price+=this.price*val;
    }
    public  void substract(boolean flag, double val){
        if(!flag)
            this.price-=this.price*val/100;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getId() {
        return id;
    }

    public void setId(int prodId) {
        this.id = id;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}

class User
{
    private String usn;
    private String userId;
    private ArrayList<Order> o;
    private ArrayList<Order> c;

    public User(String usn, String userId)
    {
        this.usn = usn;
        this.userId = userId;
        o=new ArrayList<Order>();
        c=new ArrayList<Order>();
    }

    public void addO1(Order o)
    {
        this.o.add(o);
    }

    public void addO2(Order o)
    {
        this.c.add(o);
    }
}

class Order
{
    private ArrayList<Prod> l;
    private String addr;

    public Order()
    {
        l = new ArrayList<Prod>();
    }
    public void add(Prod p)
    {
        if(l.size() > 99)
            return;

        l.add(p);
    }

    public void remove(Prod p)
    {
        l.remove(p);
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}

class InventoryP
{
    private Prod p;
    private int q;

    public InventoryP(Prod p, int q)
    {
        this.p = new Prod(p);
        this.q = q;
    }
    public Prod getP() {
        return p;
    }

    public void setP(Prod p) {
        this.p = p;
    }

    public int getQ() {
        return q;
    }

    public void setQ(int q) {
        this.q = q;
    }
}