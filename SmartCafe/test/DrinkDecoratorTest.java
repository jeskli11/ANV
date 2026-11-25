import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrinkDecoratorTest {

    @Test
    public void testToGoDecoratorAddsToGoLabel() {
        CustomDrink drink = new CustomDrink.Builder("coffee").build();

        CustomDrink decoratedDrink = new ToGoDecorator(drink);

        assertEquals("Ordered Coffee [to-go]", decoratedDrink.toString());
    }

    @Test
    public void testOwnMugDecoratorAddsOwnMugLabel() {
        CustomDrink drink = new CustomDrink.Builder("tea").build();

        CustomDrink decoratedDrink = new OwnMugDecorator(drink);

        assertEquals("Ordered Tea [own mug]", decoratedDrink.toString());
    }

    @Test
    public void testDecoratorsCanBeCombined() {
        CustomDrink drink = new CustomDrink.Builder("coffee").milk().build();

        CustomDrink decoratedDrink = new OwnMugDecorator(new ToGoDecorator(drink));

        assertEquals("Ordered Coffee, milk [to-go] [own mug]", decoratedDrink.toString());
    }

    @Test
    public void testDecoratorOrderIsPreserved() {
        CustomDrink drink = new CustomDrink.Builder("tea").sugar().build();

        CustomDrink decoratedDrink = new ToGoDecorator(new OwnMugDecorator(drink));

        assertEquals("Ordered Tea, sugar [own mug] [to-go]", decoratedDrink.toString());
    }
}
