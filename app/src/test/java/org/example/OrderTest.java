package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class OrderTest {

    @Test
    public void testGetCustomer() {
        Customer customer = new Customer("John", true);
        Item item = new Item("Laptop", 1200.0, 1);
        Order order = new Order(customer, List.of(item));

        assertEquals("John", order.getCustomer().getName());
    }

    @Test
    public void testGetItems() {
        Customer customer = new Customer("Alice", false);
        Item item1 = new Item("Laptop", 1200.0, 2);
        Item item2 = new Item("Phone", 800.0, 1);
        Order order = new Order(customer, List.of(item1, item2));

        assertEquals(2, order.getItems().size());
        assertEquals("Laptop", order.getItems().get(0).getName());
        assertEquals("Phone", order.getItems().get(1).getName());
    }
}
