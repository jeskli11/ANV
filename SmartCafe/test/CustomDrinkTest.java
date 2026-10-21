import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CustomDrinkTest {

    @Test
    public void testBuildsDrinkWithoutCustomizations() {
        CustomDrink drink = new CustomDrink.Builder("tea").build();

        assertEquals("Ordered Tea", drink.toString());
    }

    @Test
    public void testAddsAllCustomizationsInOrder() {
        CustomDrink drink = new CustomDrink.Builder("coffee")
                .milk()
                .sugar()
                .caramel()
                .build();

        assertEquals("Ordered Coffee, milk, sugar, caramel", drink.toString());
    }

    @Test
    public void testAddsOnlySelectedCustomizations() {
        CustomDrink drink = new CustomDrink.Builder("tea")
                .caramel()
                .milk()
                .build();

        assertEquals("Ordered Tea, milk, caramel", drink.toString());
    }

    @Test
    public void testRejectsUnsupportedBaseDrink() {
        CustomDrink drink = new CustomDrink.Builder("water").build();

        assertThrows(IllegalArgumentException.class, drink::toString);
    }
}
