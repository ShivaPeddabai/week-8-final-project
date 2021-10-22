public class MediumSize implements SizeAdapter{
    Carpet carpet;


    public MediumSize(Carpet carpet) {
        this.carpet = carpet;
    }

    @Override
    public void mediumCarpet() {
        System.out.println("Carpet of size 5x5");
    }

    @Override
    public void bigCarpet() {

    }
}
