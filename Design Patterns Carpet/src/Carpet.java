public class Carpet implements SizeSelect{
    SizeAdapter size;
    String color;
    int price;

    public Carpet(String color) {
        this.color = color;
    }

    @Override
    public void selectSize(String size) {
        if(size.equals("Medium")){
            this.size=new MediumSize(this);
            this.size.mediumCarpet();
            this.price=1000;
        }
        else if(size.equals("Big")){
            this.size=new BigSize(this);
            this.size.bigCarpet();
            this.price=2500;
        }
        else{
            this.size=null;
        }
    }
}
