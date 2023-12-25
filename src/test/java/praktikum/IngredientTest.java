package praktikum;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IngredientTest {
    private Ingredient ingredient;

    @Before
    public void createNewBun() {
        ingredient = new Ingredient(IngredientType.SAUCE, "chili sauce", 300);
    }

    @Test
    public void getTypeShowOk() {
        IngredientType expected = IngredientType.valueOf("SAUCE");
        IngredientType actual = ingredient.getType();

        assertEquals(expected, actual);
    }

    @Test
    public void getNameShowOk() {
        String expected = "chili sauce";
        String actual = ingredient.getName();

        assertEquals(expected, actual);
    }

    @Test
    public void getPriceShowOk() {
        float expected = 300;
        float actual = ingredient.getPrice();

        assertEquals(expected, actual, 0);
    }
}

