public class DrinkFactory {
    public static Drink createDrink(String drinkType) {
        if ("tea".equalsIgnoreCase(drinkType)) {
            return new Tea();
        } else if ("coffee".equalsIgnoreCase(drinkType)) {
            return new Coffee();
        }

        throw new IllegalArgumentException("Unsupported drink type: " + drinkType);
    }
}
