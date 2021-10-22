public class CarpetFactory {

    public Carpet getCarpet(String size,String color){
        Carpet c=new Carpet(color);
        c.selectSize(size);
        return c;
    }
}
