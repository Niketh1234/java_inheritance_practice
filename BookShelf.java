import java.util.*;
public class BookShelf extends Furniture{
    byte noOfShelves;
    public void accept()
    {
        super.accept();
        System.out.print("Enter the number of shelves              : ");
        noOfShelves = sc.nextByte();
    }
    public void display()
    {
        System.out.println("\nThe Details of Book Shelf => ");
        super.display();
        System.out.println("Number of Shelves : "+noOfShelves);
    }
}