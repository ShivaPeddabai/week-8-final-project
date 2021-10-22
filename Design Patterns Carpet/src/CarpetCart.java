import java.util.ArrayList;

public class CarpetCart {
    static CarpetCart carpetCart=new CarpetCart();
    ArrayList<Carpet> carpets;




    public void addCarpet(Carpet c){
        carpets.add(c);
    }

    public void removeCarpet(int index){
        carpets.remove(index-1);
    }

    public void checkout(){
        int total=0;
        for(Carpet c:carpets){
            total+=c.price;
        }
        System.out.println("Your total is "+total+" dollars.");
    }
    private CarpetCart(){
        carpets=new ArrayList<>();
    }

    public static CarpetCart getInstance(){
        return carpetCart;
    }
}
