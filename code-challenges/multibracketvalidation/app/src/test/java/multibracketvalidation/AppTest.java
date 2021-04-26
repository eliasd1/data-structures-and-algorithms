/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package multibracketvalidation;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void testMultiBracketValidation() {
        App classUnderTest = new App();
        assertTrue(App.multiBracketValidation("{}"));
        assertTrue(App.multiBracketValidation("{}(){}"));
        assertTrue(App.multiBracketValidation("()[[Extra Characters]]"));
        assertTrue(App.multiBracketValidation("(){}[[]]"));
        assertTrue(App.multiBracketValidation("{}{Code}[Fellows](())"));
        assertFalse(App.multiBracketValidation("[({}]"));
        assertFalse(App.multiBracketValidation("(]("));
        assertFalse(App.multiBracketValidation("{(})"));
    }
}