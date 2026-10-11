//Juan Barreras
//CS 2012 - 05
// Lab 04
package hw04;
public class CBITester {
    
    //Main method to demonstrate functionality of CustomBigInteger.java
    public static void main(String[] args) {
        // Test Case 1: 2 + 2 = 4
        CustomBigInteger num1 = new CustomBigInteger("2");
        CustomBigInteger num2 = new CustomBigInteger("2");
        CustomBigInteger result = num1.add(num2);
        System.out.println(num1 + " + " + num2 + " = " + result);
        //Output: 4

        // Test Case 2: 99999 + 9 = 100008
        CustomBigInteger num3 = new CustomBigInteger("99999");
        CustomBigInteger num4 = new CustomBigInteger("9");
        CustomBigInteger result2 = num3.add(num4);
        System.out.println(num3 + " + " + num4 + " = " + result2);
        //Output: 100008

        // Test Case 3: 97654345678909876545743658 + 9787963247908676445789098
        CustomBigInteger num5 = new CustomBigInteger("97654345678909876545743658");
        CustomBigInteger num6 = new CustomBigInteger("9787963247908676445789098");
        CustomBigInteger result3 = num5.add(num6);
        System.out.println(num5 + " + " + num6 + " = " + result3);
        //Output: 107442308926818552991532756
    }
}