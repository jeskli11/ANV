import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertNotNull;

public class CafeConfigTest {

    @Test
    public void testGetInstanceNotNull() {
        CafeConfig config = CafeConfig.getInstance();
        assertNotNull("Instance should not be null", config);
    }

    @Test
    public void testGetInstanceAlwaysSame() {
        CafeConfig config1 = CafeConfig.getInstance();
        CafeConfig config2 = CafeConfig.getInstance();
        assertSame("Both calls should return the same instance", config1, config2);
    }

    @Test
    public void testCafeNameIsCorrect() {
        CafeConfig config = CafeConfig.getInstance();
        assertEquals("Cafe name should match the expected value", "Smart Café", config.getCafeName());
    }
}