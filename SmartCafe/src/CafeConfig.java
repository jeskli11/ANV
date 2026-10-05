public class CafeConfig {
    private static final String CAFE_NAME = "Smart Cafe";
    private static CafeConfig instance;

    private CafeConfig() {
    }

    public static synchronized CafeConfig getInstance() {
        if (instance == null) {
            instance = new CafeConfig();
        }
        return instance;
    }

    public String getCafeName() {
        return CAFE_NAME;
    }
}
