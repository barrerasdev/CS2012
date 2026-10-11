//Juan Barreras
//CS 2012 - 05
// Lab 04
package hw04;
public class CustomBigInteger {

    // Data field to store digits of CustomBigIntegers
    private int[] digits;

    //Constructor to initialize object
    public CustomBigInteger(String value) {
        parseBigInt(value);
    }

    // Method to convert string to integer array
    private void parseBigInt(String value) {
        // Initialize digits based on the length of the string
        digits = new int[value.length()];

        // Fill the digits array with each digit from the string
        for (int i = 0; i < value.length(); i++) {
            digits[i] = Integer.parseInt(String.valueOf(value.charAt(i)));
        }
    }

    // Method to add two CustomBigIntegers and return a new CustomBigInteger
    public CustomBigInteger add(CustomBigInteger other) {
        // Reverse arrays for right to left addition
        int[] first = reverseArray(this.digits);
        int[] second = reverseArray(other.digits);

        // Find max length between both arrays
        int maxLength;
        if (first.length > second.length) {
            maxLength = first.length;
        } else {
            maxLength = second.length;
        }

        // Initialize new result array with length of +1 in case of carried digits
        int[] result = new int[maxLength + 1];

        // Add both strings
        int carry = 0;
        for (int i = 0; i < maxLength; i++) {
            int digit1 = 0;
            if (i < first.length) {
                digit1 = first[i];
            }
            int digit2 = 0;
            if (i < second.length) {
                digit2 = second[i];
            }
            int sum = digit1 + digit2 + carry;
            result[i] = sum % 10;
            carry = sum / 10;
        }

        // If an integer is being carried still, add it to last position
        result[maxLength] = carry;

        // Convert result back to a string
        String resultString = "";
        boolean leadingZero = true;
        for (int i = result.length - 1; i >= 0; i--) {
            if (leadingZero && result[i] == 0 && i != 0) {
                continue;  // Ignore leading zeros
            }
            leadingZero = false;
            resultString += result[i];
        }

        // Return new CustomBigInteger from result string
        return new CustomBigInteger(resultString);
    }

    // Additional method to reverse an integer array
    private int[] reverseArray(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }

    // toString method to convert the digits array back to a string
    public String toString() {
        String result = "";
        for (int i = 0; i < digits.length; i++) {
            result += digits[i];
        }
        return result;
    }
}
// This program creates custom big integers and adds them. In order to initialize them as
// objects, I have used the Integer.parseInt function and my data field digits. Then, in
// my "add" method, I added them as if I were adding one by one, from right to left using
// an additional reverse method, and accounting for any 0 or any carried numbers. Finally,
// I return the string.