/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sir_Tauseef_program;

/**
 *
 * @author Abdul Rafay
 */
/* Classes : Publication ; Books ;  Magzine ;Kids Magzine
Attributes and methods for given classes:
Publication:  publisher : str , title: str, num_of_pages: int, price: double;;  print(): void --> prints all the information.
Books: author: str;; @Override print() from Publication class.
Magzine: Publication_unit ( monthly , weekly , biweekly);; @Override print().
Kids_magzine extends Magzine extends Publication: has a recommended int age_range.  
*/
class Publication {
    private String publisher;
    private String title;
    private int num_of_pages;
    private double price;

    public Publication(String publisher, String title, int num_of_pages, double price) {
        this.publisher = publisher;
        this.title = title;
        this.num_of_pages = num_of_pages;
        this.price = price;
    }

    public void print() {
        System.out.println("Publisher: " + publisher);
        System.out.println("Title: " + title);
        System.out.println("Number of pages: " + num_of_pages);
        System.out.println("Price: $" + price);
    }
}

class Books extends Publication {
    private String author;

    public Books(String publisher, String title, int num_of_pages, double price, String author) {
        super(publisher, title, num_of_pages, price);
        this.author = author;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Author: " + author);
    }
}
class Magazine extends Publication {
    private String publication_unit;

    public Magazine(String publisher, String title, int num_of_pages, double price, String publication_unit) {
        super(publisher, title, num_of_pages, price);
        this.publication_unit = publication_unit;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Publication unit: " + publication_unit);
    }
}
//class KidsMagazine extends Magazine {
//
//    private int recommended_age_range;
//    public  KidsMagazine(String publisher, String title, int num_of_pages, double price, String publication_unit, int recommended_age_range){
//        super(publisher, title, num_of_pages, price, publication_unit);
//        this.recommended_age_range = recommended_age_range;
//    
//    }
//}
class KidsMagazine extends Magazine {
    private int recommended_age_range;

    public KidsMagazine(String publisher, String title, int num_of_pages, double price,
                        String publication_unit, int recommended_age_range) {
        super(publisher, title, num_of_pages, price, publication_unit);
        this.recommended_age_range = recommended_age_range;
    }

    public int getRecommended_age_range() {
        return recommended_age_range;
    }
    
//    public void setRecommendedAgeRange(int recommended_age_range) {
//        if (int recommended_age_range >= 0 && recommended_age_range <= 15)  {
//                this.recommended_age_range = recommended_age_range;
//         } else {
//                 System.out.println("invalid age range");
//                 }
//    }
     public void setRecommended_age_range(int recommended_age_range) {
        if (recommended_age_range >= 0 && recommended_age_range <= 15) {
            this.recommended_age_range = recommended_age_range;
        } else {
            System.out.println("Invalid age range");
        }
    }
    

    @Override
    public void print(){
    
        super.print();
        System.out.println("Recommended age range: " + recommended_age_range + " years");
    }
}



public class Library {
    public static void main(String[] args) {
        
    }
}
