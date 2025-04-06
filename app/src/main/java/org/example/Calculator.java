package org.example;
public class Calculator {
    public double calculate(double operand1, double operand2) {
        double sum = operand1 + operand2;
        double product = operand1 * operand2;
        return sum / product;
    }

    public void printResult(double result) {
        System.out.println("Result: " + result);
    }
    
}
