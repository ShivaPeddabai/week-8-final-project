public class BigSize implements SizeAdapter{
    Carpet carpet;

    public BigSize(Carpet carpet) {
        this.carpet = carpet;
    }

    @Override
    public void mediumCarpet() {

    }

    @Override
    public void bigCarpet() {
        System.out.println("Carpet of size 15x15");
    }
}
