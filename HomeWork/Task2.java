// V 10: Character Operations
// Objective: To understand and use primitive char type in Java.
// Instructions:
// Declare a char variable.
// Use Character methods (e.g., isDigit, isLetter, toUpperCase, toLowerCase) to manipulate the char.
// Print the result of each operation to the console.


public class Task2 {
    public static void main(String[] args)
    {
    
    char c1 = 'A', c2 = '4', c3 = 'a';
        
    System.out.println(
        c1 + " is a digit -> "
        + Character.isDigit(c1));
    System.out.println(
        c2 + " is a digit -> "
        + Character.isDigit(c2));
    System.out.println(
        c1 + " is a isLetter -> "
        + Character.isLetter(c1));
    System.out.println(
        c2 + " is a isLetter -> "
        + Character.isLetter(c2));
    System.out.println(
        c3 + " is a toUpperCase -> "
        + Character.toUpperCase(c3));
    System.out.println(
        c1 + " is a toLowerCase -> "
        + Character.toLowerCase(c1));
    }
}
