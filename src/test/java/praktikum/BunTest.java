package praktikum;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BunTest {
    private Bun bun;

    @Before
    public void createNewBun() {
        bun = new Bun("red bun", 300);
    }

    @Test
    public void getNameBunShowsOk() {
        String expected = "red bun";
        String actual = bun.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void getPriceBunShowsOk() {
        float expected = 300;
        float actual = bun.getPrice();
        assertEquals(expected, actual, 0);
    }
}