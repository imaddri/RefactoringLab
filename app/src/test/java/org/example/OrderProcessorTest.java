package org.example;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
public class OrderProcessorTest {

    @Test
    public void testPrintOrderSummary() {
       
        Item item1 = new Item("Item1", 10.0, 2);
        Item item2 = new Item("Item2", 5.0, 3);
        Customer customer = new Customer("John Doe", true);  
        Order order = new Order(customer, List.of(item1, item2));
        OrderProcessor orderProcessor = new OrderProcessor();

        
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);  

        
        orderProcessor.printOrderSummary(order);

        
        String output = baos.toString();

        
        assertTrue(output.contains("Order Summary"));
        assertTrue(output.contains("Customer: John Doe"));
        assertTrue(output.contains("Items:"));
        assertTrue(output.contains("  - Item1: 2 x $10.00 = $20.00"));
        assertTrue(output.contains("  - Item2: 3 x $5.00 = $15.00"));
        assertTrue(output.contains("Total Price: $31.50")); 

        
        System.setOut(System.out);
    }
}
