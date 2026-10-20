public class Main {
    public static void main(String[] args) {
        // Pattern singleton
        System.out.println(CafeConfig.getInstance().getCafeName());

        // Pattern factory
        System.out.println(DrinkFactory.createDrink("tea").serve() + " in " + CafeConfig.getInstance().getCafeName());
        System.out.println(DrinkFactory.createDrink("coffee").serve() + " in " + CafeConfig.getInstance().getCafeName());

        // Pattern builder
        CustomDrink customDrink = new CustomDrink.Builder("coffee").milk().sugar().build();
        System.out.println(customDrink +" in "+CafeConfig.getInstance().getCafeName());
    }
}