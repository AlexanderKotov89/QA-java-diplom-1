package praktikum;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IngredientTest {
    private Ingredient ingredient;

    @Before
    public void createNewBun(){
       ingredient = new Ingredient(IngredientType.SAUCE, "chili sauce", 300);
    }

    @Test
    public void getTypeShowOk(){
        IngredientType actual = ingredient.getType();
        IngredientType expected = IngredientType.SAUCE;
        assertEquals(expected, actual);
    }
    @Test
    public void getNameShowOk(){
        String actual = ingredient.getName();
        String expected = "chili sauce";
        assertEquals(actual, expected);
    }
    @Test
    public void getPriceShowOk(){
        float actual = ingredient.getPrice();
        float expected = 300;
        assertEquals(actual, expected, 0);
    }
}

