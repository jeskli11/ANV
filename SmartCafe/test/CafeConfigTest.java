public class CafeConfigTest {
    public static void main(String[] args) {
        testGetInstanceReturnsSameInstance();
        testGetCafeName();
        System.out.println("All CafeConfig tests passed.");
    }

    private static void testGetInstanceReturnsSameInstance() {
        CafeConfig firstInstance = CafeConfig.getInstance();
        CafeConfig secondInstance = CafeConfig.getInstance();

        if (firstInstance != secondInstance) {
            throw new AssertionError("getInstance() should always return the same instance.");
        }
    }

    private static void testGetCafeName() {
        String cafeName = CafeConfig.getInstance().getCafeName();

        if (!"Smart Cafe".equals(cafeName)) {
            throw new AssertionError("Expected cafe name to be 'Smart Cafe' but got '" + cafeName + "'.");
        }
    }
}
