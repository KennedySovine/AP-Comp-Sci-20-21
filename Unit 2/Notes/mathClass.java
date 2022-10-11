import java.util.*;
public class mathClass{
   public static void main (String [] args){
   
    /*
    There is a class called Math that allows us to do many mathematical functions. Since the class is static, you don't need to create objects to use the methods.
    
    Math.abs(int number)/Math.abs(double number) --> Will return whatever type the argument is. Absolute Value.
    Math.pow(double num, double power) --> Returns a double. Raises a number to a power.
    Math.sqrt(double num) --> Roots a number. Returns double.
    Math.random() --> Returns a double between 0 and .99.
    
    Math.random()
    -Helps us produce random numbers, but we need to do some manipulating if we want an integer number rather than a double, or a specific range.
    1) To increase the range, we can multiply Math.random() by any number.
        -Math.random()*10 --> makes the range (0, 9.9)
    2) To shift the range, we can add to Math.random()
        -Math.random()*10+6 --> makes the range  (6, 15.9)
    3) To get random integer numbers, we cast the Math.random() to an int
        -(int)(Math.random*10+6) --> makes the range (6, 15)
        
    If youre going to cast an int, multiply math.random by 1 number higher than your intended largest number, because casting cuts off the last decimal.
    */
    }
}