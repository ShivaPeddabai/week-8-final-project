import java.util.Scanner;

public class Driver {

    public static void main(String[]args){
        CarpetFactory factory=new CarpetFactory();
        CarpetCart carpetCart=CarpetCart.getInstance();
        int input=0;
        String s="";
        Scanner sc=new Scanner(System.in);


        while(input!=3){
            System.out.println("What do you want to do?\n1- Buy Carpets\n2- Remove Carpet\n3- Checkout");
            input= Integer.parseInt(sc.nextLine());

            if(input==1){
                System.out.println("Enter color of carpet:");
                String color=sc.nextLine();
                System.out.println("Enter size:");
                String size=sc.nextLine();
                Carpet carpet=factory.getCarpet(size,color);
                carpetCart.carpets.add(carpet);
                System.out.println("Carpet added to cart!");
            }
            else if(input==2){
                System.out.println("Which carpet do you want to remove?");
                for(int i=0;i<carpetCart.carpets.size();i++){
                    System.out.println("Carpet "+(i+1));
                }
                int index= Integer.parseInt(sc.nextLine());
                carpetCart.removeCarpet(index);
                System.out.println("Carpet added to cart!");
            }
        }

        carpetCart.checkout();
    }
}
