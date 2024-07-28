/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sir_Tauseef_program;

/**
 *
 * @author Abdul Rafay
 */
import java.util.Scanner;

abstract class NewspaperSubscriber {

    protected String streetAddress;
    protected double subscriptionRate;

    public NewspaperSubscriber(String address) {
        this.streetAddress = address;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String address) {
        this.streetAddress = address;
    }

    public abstract void setSubscriptionRate();

    public double getSubscriptionRate() {
        return subscriptionRate;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NewspaperSubscriber other = (NewspaperSubscriber) obj;
        return streetAddress.equals(other.streetAddress);
    

     

    }

    public abstract String toString();
}

class SevenDaySubscriber extends NewspaperSubscriber {

    public SevenDaySubscriber(String address) {
        super(address);
        setSubscriptionRate();
    }

    @Override
    public void setSubscriptionRate() {
        subscriptionRate = 4.50;
    }

    @Override
    public String toString() {
        return "SevenDaySubscriber: " + streetAddress + ", $" + subscriptionRate + "/week";
    }
}

class WeekdaySubscriber extends NewspaperSubscriber {

    public WeekdaySubscriber(String address) {
        super(address);
        setSubscriptionRate();
    }

    @Override
    public void setSubscriptionRate() {
        subscriptionRate = 3.50;
    }

    @Override
    public String toString() {
        return "WeekdaySubscriber: " + streetAddress + ", $" + subscriptionRate + "/week";
    }
}

class WeekendSubscriber extends NewspaperSubscriber {

    public WeekendSubscriber(String address) {
        super(address);
        setSubscriptionRate();
    }

    @Override
    public void setSubscriptionRate() {
        subscriptionRate = 2.00;
    }

    @Override
    public String toString() {
        return "WeekendSubscriber: " + streetAddress + ", $" + subscriptionRate + "/week";
    }
}

public class Subscriber_of_newspaper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter street address: ");
        String address = scanner.nextLine();

        System.out.print("Enter subscription type (7 for SevenDay, 5 for Weekday, 2 for Weekend): ");
        int type = scanner.nextInt();

        NewspaperSubscriber subscriber;
        if (type == 7) {
            subscriber = new SevenDaySubscriber(address);
        } else if (type == 5) {
            subscriber = new WeekdaySubscriber(address);
        } else if (type == 2) {
            subscriber = new WeekendSubscriber(address);
        } else {
            System.out.println("Invalid subscription type");
            return;
        }

        System.out.println(subscriber);
    }
}
