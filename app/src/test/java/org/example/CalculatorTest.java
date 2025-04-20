package org.example;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class CalculatorTest {

    @Test
    public void t() {
        Calculator c = new Calculator();
        ByteArrayOutputStream o = new ByteArrayOutputStream();
        System.setOut(new PrintStream(o));
        c.prtRes(5.0);
        assertTrue(o.toString().contains("Result: 5.0"));
    }
}



