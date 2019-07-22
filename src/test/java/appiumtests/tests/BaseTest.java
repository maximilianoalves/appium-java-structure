package appiumtests.tests;

import appiumtests.utils.Env;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {

    @BeforeAll
    public static void setup() throws Exception { Env.open(); }

    @AfterAll
    public static void tearDown() {
        Env.close();
    }

}
