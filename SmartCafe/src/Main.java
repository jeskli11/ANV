public class Main {
    public static void main(String[] args) {
        // Return café name
        System.out.println(CafeConfig.getInstance().getCafeName());

        System.out.println(DrinkFactory.createDrink("tea").serve() + " in " + CafeConfig.getInstance().getCafeName());
        System.out.println(DrinkFactory.createDrink("coffee").serve() + " in " + CafeConfig.getInstance().getCafeName());
    }
}