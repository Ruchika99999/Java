package Basics;
import java.lang.Math;

public class MathMethods {
    public static void main(String[] args) { 
        // 1. Find the highest value between x and y 
        int max = Math.max(5, 10); 
        System.out.println("Max: " + max); // Max: 10 
        // 2. Find the lowest value between x and y 
        int min = Math.min(5, 10); 
        System.out.println("Min: " + min); // Min: 5 
        // 3. Find the square root of x 
        double sqrt = Math.sqrt(64); 
        System.out.println("Square Root: " + sqrt); // Square Root: 8.0 
        // 4. Find the absolute value of x 
        double abs = Math.abs(-4.7); 
        System.out.println("Absolute Value: " + abs); // Absolute Value: 4.7 
        // 5. Generate a random number between 0.0 (inclusive) and 1.0 (exclusive) 
        double random = Math.random(); 
        System.out.println("Random: " + random); // Random: 0.538475 (example) 
        // Generate a random number between 0 and 100 
        int randomNum = (int) (Math.random() * 101); 
        System.out.println("Random Number (0-100): " + randomNum); // Random Number: x (example) 
        // 6. Calculate the power of x raised to y 
        double power = Math.pow(2, 3); 
        System.out.println("Power: " + power); // Power: 8.0 
        // 7. Calculate the natural logarithm of x
        double log = Math.log(5); 
        System.out.println("Natural Logarithm: " + log); // Natural Logarithm :1.6094379124341003
        // 8. Calculate the base 10 logarithm of x 
        double log10 = Math.log10(100); 
        System.out.println("Base 10 Logarithm: " + log10); // Base 10 Logarithm: 2.0 
        // 9. Calculate the exponential of x (e^x) 
        double exp = Math.exp(1); System.out.println("Exponential: " + exp); // Exponential: 2.718281828459045 
        // 10. Round the value to the nearest integer 
        long round = Math.round(4.6); 
        System.out.println("Rounded: " + round); // Rounded: 5 
        // 11. Round the value upwards to the nearest integer
        double ceil = Math.ceil(4.3); 
        System.out.println("Ceiling: " + ceil); // Ceiling: 5.0 
        // 12. Round the value downwards to the nearest integer 
        double floor = Math.floor(4.9); 
        System.out.println("Floor: " + floor); // Floor: 4.0
    }
}
