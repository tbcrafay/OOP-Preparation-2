/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*Create a class with a String instance variable. Initialize the variable to null. Try to print the length of the string without checking for null. Handle the NullPointerException.*/
package Exception_handling;

/**
 *
 * @author Abdul Rafay
 */
class StringLengthExample {
    private String myString;

    public StringLengthExample() {
        this.myString = null; // Initialize the string to null
    }

    public void printStringLength() {
        try {
            // Attempt to print the length of the string
            System.out.println("Length of the string: " + myString.length());
        } catch (NullPointerException e) {
            // Handle the NullPointerException
            System.out.println("Caught a NullPointerException: The string is null.");
        }
    }
}
public class Null_point_exception {
    public static void main(String[] args) {
        
        StringLengthExample example = new StringLengthExample();
        example.printStringLength();
    
    }
}
