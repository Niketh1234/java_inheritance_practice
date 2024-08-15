import java.util.Scanner;
public class Furniture{
    double height,width,price;
    String color;
    int qty;
    Scanner sc = new Scanner(System.in);
    public void accept()
    {
        System.out.print("Enter the height                         : ");
        height = sc.nextDouble();
        System.out.print("Enter the width                          : ");
        width = sc.nextDouble();
        System.out.print("Enter the color                          : ");
        color = sc.next();
        System.out.print("Enter the quantity                       : ");
        qty = sc.nextInt();
        System.out.print("Enter the price                          : ");
        price = sc.nextDouble();
    }
    public void display()
    {
        System.out.println("Height            : "+height);
        System.out.println("Width             : "+width);
        System.out.println("Color             : "+color);
        System.out.println("quantity          : "+qty);
        System.out.println("price             : "+price);
        
    }
}
