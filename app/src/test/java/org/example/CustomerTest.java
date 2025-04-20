package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.lang.reflect.*;

public class CustomerTest {

    @Test
    public void t() throws Exception {
        Customer c = new Customer();

        Field n = Customer.class.getDeclaredField("name");
        Field m = Customer.class.getDeclaredField("isMember");

        n.setAccessible(true);
        m.setAccessible(true);

        n.set(c, "Ali");
        m.set(c, true);

        assertEquals("Ali", c.getName());
        assertTrue(c.isMember());

        m.set(c, false);
        assertFalse(c.isMember());
    }
}
