/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception_handling;
import  java.util.Scanner;
/**
 *
 * @author Abdul Rafay
 */
public class Number_format_exception {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 


        System.out.print("Enter a number: ");
        String input = scanner.nextLine();

        try {
            int number = Integer.parseInt(input); 
 // Convert the string to an integer
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter a number.");
        }
    }
}
