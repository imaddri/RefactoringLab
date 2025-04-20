package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.lang.reflect.*;

public class ItemTest {

    @Test
    public void t() throws Exception {
        Item i = new Item();

        Field n = Item.class.getDeclaredField("name");
        Field p = Item.class.getDeclaredField("price");
        Field q = Item.class.getDeclaredField("quantity");

        n.setAccessible(true);
        p.setAccessible(true);
        q.setAccessible(true);

        n.set(i, "Laptop");
        p.set(i, 1200.0);
        q.set(i, 3);

        assertEquals("Laptop", i.getName());
        assertEquals(1200.0, i.getPrice());
        assertEquals(3, i.getQuantity());
    }
}
