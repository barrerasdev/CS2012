// Juan Barreras
// In class exercise
// File I/O
// This program reads a file through fileScanner using its path
// and converts it to a string in order to check if the string
// contains all 26 letters of the alphabet.

package inclassexercise;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AlphabetChecker {
    public static void main(String[] args) {
        try {
            // Initialize scanner to read the file
            Scanner fileScanner = new Scanner(System.in);
            System.out.println("Enter the path of the text file:");
            String filePath = fileScanner.nextLine();

            // Read the file content into a string
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            StringBuilder fileContent = new StringBuilder();
            while (scanner.hasNextLine()) {
                fileContent.append(scanner.nextLine());
            }

            // Convert content to uppercase
            String content = fileContent.toString().toUpperCase();

            // Check for all letters of the alphabet
            boolean allLetters = true;
            for (int i = 65; i < 65 + 26; i++) {
                if (!content.contains(String.valueOf((char) i))) {
                    allLetters = false;
                    break;
                }
            }
            // Output result
            if (allLetters) {
                System.out.println("The text contains all 26 letters of the alphabet.");
            } else {
                System.out.println("The text does not contain all 26 letters of the alphabet.");
            }
        //In case file is not found
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
