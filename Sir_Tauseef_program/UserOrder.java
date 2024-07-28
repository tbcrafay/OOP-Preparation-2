/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sir_Tauseef_program;
import java.util.Scanner;
/**
 *
 * @author Abdul Rafay
 */
class Order {

    private String customer_name;
    private int customer_number;
    private int quantity_order;
    private double unit_price;
    private double total_price;

//    public Order(String customer_name, int customer_number, int quantity_order, double unit_price) {
//        this.customer_name = customer_name;
//        this.customer_number = customer_number;
//        this.quantity_order = quantity_order;
//        this.unit_price = unit_price;
//        this.total_price = calculateTotalPrice();
//    }
    public double calculateTotalPrice(){
    
        total_price = quantity_order * unit_price;
        return total_price;
        
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        customer_name = sc.nextLine();
    }

    public int getCustomer_number() {
        return customer_number;
    }

    public void setCustomer_number() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        customer_number = sc.nextInt();
    }

    public int getQuantity_order() {
        return quantity_order;
    }

    public void setQuantity_order() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Quantity: ");
        quantity_order = sc.nextInt();
    }

    public double getUnit_price() {
        return unit_price;
    }

    public void setUnit_price() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the unit price of the product: ");
        unit_price = sc.nextDouble();
    }
    public void display(){
    
        System.out.println("Customer name:" + customer_name);
        System.out.println("customer phone number: " + customer_number);
        System.out.println("quantity of order: " + quantity_order);
        System.out.println("unit price: " + unit_price);
        System.out.println("total price : " + total_price);
    }
 
}

class ShippingOrder extends Order{

    private double Shipping_charges = 4.0;

    public double getShipping_charges() {
        return Shipping_charges;
    }
 
    @Override
    public double calculateTotalPrice(){
    
        return super.calculateTotalPrice() + Shipping_charges;
    }
    
}


public class UserOrder {
    public static void main(String[] args) {
//        Order customer1 = new Order();
        ShippingOrder customer1 = new ShippingOrder();
       
        customer1.setCustomer_name();
        customer1.setCustomer_number();
        customer1.setQuantity_order();
        customer1.setUnit_price();
        customer1.calculateTotalPrice();
        customer1.display();
        System.out.println("by adding Shipping charges :" + customer1.getShipping_charges() + " your shipping charges are: " +  customer1.calculateTotalPrice() );
    }
}
