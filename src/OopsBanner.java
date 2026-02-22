/**
 * UC4 - Full OOPS Banner
 * Hint:
 * 1. Define and populate a String array with each line of the banner using
 *    String.join() method to join the parts of each line with spaces.
 * 2. Use a for-each loop to iterate through the array and print each line
 */
public class uc5 {
    public static void main(String[] args) {

        // Define and populate the array at declaration
        String[] lines = {
            String.join("   ", "   ***  ", "   ***  ", "  *****  ", "  *****  "),
            String.join("   ", " **   **", " **   **", "  **   **", " **    "),
            String.join("   ", "**     **", "**     **", "**    **", "**     "),
            String.join("   ", "**     **", "**     **", "*****   ", " ***** "),
            String.join("   ", "**     **", "**     **", "**      ", "      **"),
            String.join("   ", " **   ** ", " **   ** ", "**      ", " **   **"),
            String.join("   ", "  ***    ", "  ***    ", "**      ", "  ***  ")
        };

        // Use a for-each loop to iterate through the array and print each line
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
