/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*Create an array of integers. Prompt the user to enter an index, and try to access and print the element at that index. Handle the ArrayIndexOutOfBoundsException that might occur if 
the user enters an invalid index.*/
package Exception_handling;

import java.util.Scanner;
/**
 *
 * @author Abdul Rafay
 */


public class Array_index_out_of_bounds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] array = {3,4,5,6,7,8};
        
        System.out.println("Enter the index number within range: " + (array.length-1) );
        int index = sc.nextInt();
        
        try{
            int element = array[index];
            System.out.println("element at index: " + index + " is: " + element);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: incrorrect Index");
        }
        
        
    }
            
}
