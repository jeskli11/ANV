import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

public class DrinkFactoryTest {

    @Test
    public void testCreatesTea() {
        Drink drink = DrinkFactory.createDrink("tea");

        assertTrue("Expected createDrink(\"tea\") to return Tea.", drink instanceof Tea);
        assertServes(drink, "Serving Tea");
    }

    @Test
    public void testCreatesCoffee() {
        Drink drink = DrinkFactory.createDrink("coffee");

        assertTrue("Expected createDrink(\"coffee\") to return Coffee.", drink instanceof Coffee);
        assertServes(drink, "Serving Coffee");
    }

    @Test
    public void testRejectsUnsupportedDrink() {
        assertThrows(IllegalArgumentException.class, () -> DrinkFactory.createDrink("water"));
    }

    private void assertServes(Drink drink, String expected) {
        assertEquals(expected, drink.serve());
    }
}
