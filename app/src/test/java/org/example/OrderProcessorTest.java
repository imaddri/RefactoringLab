package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.*;
import java.lang.reflect.*;
import java.util.*;

public class OrderProcessorTest {

    @Test
    public void t() {
        Item i1 = new Item("Item1", 10.0, 2);
        Item i2 = new Item("Item2", 5.0, 3);
        Customer c = new Customer("John Doe", true);
        Order o = new Order(c, List.of(i1, i2));
        OrderProcessor op = new OrderProcessor();

        ByteArrayOutputStream b = new ByteArrayOutputStream();
        System.setOut(new PrintStream(b));

        op.printOrderSummary(o);

        String s = b.toString();
        assertTrue(s.contains("Order Summary"));
        assertTrue(s.contains("Customer: John Doe"));
        assertTrue(s.contains("Items:"));
        assertTrue(s.contains("  - Item1: 2 x $10.0 = $20.0"));
        assertTrue(s.contains("  - Item2: 3 x $5.0 = $15.0"));
        assertTrue(s.contains("Total Price: $31.50"));

        System.setOut(System.out);
    }
}
