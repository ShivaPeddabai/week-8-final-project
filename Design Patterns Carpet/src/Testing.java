import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Testing {

    @Test
    public void testSingleton(){
        CarpetCart c1=CarpetCart.getInstance();
        CarpetCart c2=CarpetCart.getInstance();

        assertEquals(c1,c2);
    }

    @Test
    public void testFactory(){
        CarpetFactory factory=new CarpetFactory();

        Carpet c=factory.getCarpet("Medium","Blue");

        assertNotEquals(c,null);
    }

    @Test
    public void testAdapter(){
        CarpetFactory factory=new CarpetFactory();

        Carpet c=factory.getCarpet("Medium","Blue");

        assertTrue(c.size instanceof MediumSize);
    }
}
