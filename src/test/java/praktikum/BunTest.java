package praktikum;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class BunTest {
    private Bun bun;

    @Before
    public void createNewBun(){
        bun = new Bun("red bun", 300);
    }

    @Test
    public void getNameBunShowsOk(){
        String actual = bun.getName();
        String expected = "red bun";
        assertEquals(actual, expected);
    }
    @Test
    public void getPriceBunShowsOk(){
        float actual = bun.getPrice();
        float expected = 300;
        assertEquals(actual, expected, 0);
    }

}