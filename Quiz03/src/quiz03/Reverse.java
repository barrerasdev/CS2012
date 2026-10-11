/* Juan Barreras
 * CS 2012-05
 * Quiz 3
 * CIN : 401605188
 *
 * This program reverses strings using two different methods.
 * The first method creates a new empty string and uses a for
 * loop to iterate through the original string, adding each
 * character in front of the current new string. Finally, it
 * prints the new string to the console.
 *
 * The second method uses a char array to iterate through the
 * original string in reverse. First, I turn the current string
 * into a character array using .toCharArray. Then, I iterate through
 * the array backwards to print the string to the console character
 * by character.
 *
 * In the main method, I use while loops to keep the program running
 * if a bad input is entered, for example "123". Once a good input
 * is entered like "Hello", the program will move on to the next method
 * or end if it is finished.
 *
 * Inputs:
 *  Bad Input : 12345
 *  Proper Input : I am taking CS 2012
 *
 *  Bad Input : 6789
 *  Good Input: It is October 3rd
 */
package quiz03;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        //Loop Scanner with input validation for first reverse method
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a string to be reversed with method 1: ");
            if (scanner.hasNextInt()) {
                System.out.println("Not a string. Try again");
            } else {
                String input1 = scanner.nextLine();
                reverse1(input1);
                break;
            }
        }
        //Loop Scanner with input validation for second reverse method
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a string to be reversed with method 2: ");
            if (scanner.hasNextInt()) {
                System.out.print("Not a string. Try again");
            } else {
                String input = scanner.nextLine();
                reverse2(input);
                break;
            }
        }
    }
    //First reverse method using charAt to extract and add character at i in for loop
    public static void reverse1(String input) {
        char ch;
        String reversed = "";
        for (int i = 0; i < input.length(); i++) {
            ch = input.charAt(i); //Extracts each character
            reversed = ch + reversed; //Adds each character in front of the existing string
        }
        System.out.println("Reversed word: " + reversed);
    }

    //Second reverse method using toCharArray to iterate through string backwards
    public static void reverse2(String input) {
        // convert String to character array by using toCharArray
        char[] charArray = input.toCharArray();
        //Start at the end and count down
        for (int i = charArray.length - 1; i >= 0; i--)
            System.out.print(charArray[i]);
    }
}