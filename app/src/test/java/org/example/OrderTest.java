package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.lang.reflect.*;
import java.util.*;

public class OrderTest {

    @Test
    public void t() throws Exception {
        Order o = new Order();

        Field c = Order.class.getDeclaredField("customer");
        Field i = Order.class.getDeclaredField("items");

        c.setAccessible(true);
        i.setAccessible(true);

        Customer customer = new Customer();
        Item item = new Item();

        c.set(o, customer);
        i.set(o, List.of(item));

        assertEquals(customer, o.getCustomer());
        assertEquals(1, o.getItems().size());
    }
}
