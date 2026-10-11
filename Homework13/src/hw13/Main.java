// Juan Barreras, Miguel Vasquez, Daniel Solares
// CS 2012 - 06
// Lab 13 - Recursion
package hw13;

// Main class
public class Main {
    // Main method
    public static void main(String[] args) {
        // 50 iterations
        for (int i = 0 ; i < 51 ; i++) {
            // Turn double value into Long value and print
            System.out.println("Fibonacci of "+i+": "+(long)(Fibonacci(i)));
        }
    }
    // Recursive Fibonacci method
    public static double Fibonacci(double n) {
        // Fibonacci ( 1 ) = 1 , Fibonacci ( 0 ) = 0
        if (n == 0 || n == 1)
            //Returns 1 or 0
            return n;
        // Else, performs Fibonacci formula by recursing back into Fibonacci method
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
}

/*
Our group discussed different ideas on how to calculate the Fibonacci of 2000.
We decided that using a recursive method to call Fibonacci on itself, counting down,
until the method arrives at 1 or 0, whose Fibonacci's is equal to 1 or 0 would
work best. This way, if
we did Fibonacci(5): the program would do
F(5) = F(4) + F(3)
        ^ =    ^   + F (2) Fibonacci iof 4
               ^ =      ^  + F(1)  Fibonacci of 3
                              ^ = 1 + 0 Fibonacci of 2
Then it would calculate as
F (5) = 3 + 2  = 8
        ^ = 2 + 1    Fibonacci of 4
            ^ = 1 + 1   Fibonacci of 3
                    ^ = 1 + 0  Fibonacci of 2
Our program reflects this in the Fibonacci method. Since Fibonacci of 2000 takes too long, the
professor allowed us to do Fibonacci of 50. Overall, Recursion in Java streamlined our Fibonacci
process and challenged us to think outside our usual thinking patterns with loops.
 */