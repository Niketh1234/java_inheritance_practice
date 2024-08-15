import java.util.*;
import java.io.*;
public class Program
{
    public static boolean checkNoFurnitures(Furniture[] furnitures){
        if(furnitures[0] == null){
            System.out.println("There are no Furnitures registered yet.");
            return true;
        }
        return false;
    }
    public static byte takeMenuValue(){
        while(true)
        {
            try{
                return new Scanner(System.in).nextByte();
            }
            catch(InputMismatchException e){
                System.out.print("Please enter a valid number only : ");
            }
        }
    }
    public static int addToStock(Furniture[] furnitures,int index,String fType){
        if(fType == "bookShelf")
        {
            System.out.println("Enter the details of the Book Shelf => ");
            furnitures[index] = new BookShelf();
        }
        else{
            System.out.println("Enter the details of the Dining Table => ");
            furnitures[index] = new DiningTable();
        }
        furnitures[index].accept();
        return index+1;
    }
    public static void showStockDetails(Furniture[] furnitures,int index){
        if(checkNoFurnitures(furnitures) == false){
            for(int i = 0;i<index;i++)
                furnitures[i].display();
        }
        return;
    }
    public static double totalStockValue(Furniture[] furnitures,int index){
        if(checkNoFurnitures(furnitures) == false){
            double value = furnitures[0].price * furnitures[0].qty;
            for(int i =1;i<index;i++)
                value+= (furnitures[i].price * furnitures[i].qty);
            return value;
        }
        return 0.0;
    }
    public static void main(String args[])
    {
        System.out.println("\nHere is your Menu...");
        Furniture[] furnitures = new Furniture[5];
        int index = 0;
        do{
            System.out.println("\n1. Book Shelf\n2. Dining Table\n3. Show Details\n4. Show Total Stock Value\n5. Exit");
            System.out.print("Enter you choice : ");
            switch(takeMenuValue()){
                case 1:
                    System.out.println("Number of Entries : "+addToStock(furnitures,index++,"bookShelf"));
                    break;
                case 2:
                    System.out.println("Number of Entries : "+addToStock(furnitures,index++,"diningTable"));
                    break;
                case 3:
                    showStockDetails(furnitures,index);
                    break;
                case 4:
                    System.out.println("The total stock value is : "+totalStockValue(furnitures,index));
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Seems like you entered a wrong choice.\nRedirecting to the Menu...");
                    continue;
            }
        }while(index<5);
    }
}