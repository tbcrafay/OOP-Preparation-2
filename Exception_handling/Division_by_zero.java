/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*Create a Java program that prompts the user to enter two numbers. Divide the first number by the second number and print the result. Handle the ArithmeticException that might occur
if the user enters 0 as the divisor.*/

package Exception_handling;

/**
 *
 * @author Abdul Rafay
 */

import java.util.Scanner;
class Division {

    int num1;
    int num2;
    
    public void division(){
    
        try{
                int division = this.num1/this.num2;
                System.out.println("Result: " + division);
        } catch (ArithmeticException e){
        
            System.out.println("Error: Division By zero.");
        }
    }
}



public class Division_by_zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();
        
        System.out.println("Enter Number 2: ");
        int num2 = sc.nextInt();
        
        Division result  = new Division();
        result.num1= num1;
        result.num2 = num2;
        result.division();
    }
}
