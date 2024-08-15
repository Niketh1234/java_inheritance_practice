public class DiningTable extends Furniture{
    byte noOfLegs;
    public void accept()
    {
        super.accept();
        System.out.print("Enter the number of legs                 : ");
        noOfLegs = sc.nextByte();
    }
    public void display()
    {
        System.out.println("\nThe Details of Dining Table => ");
        super.display();
        System.out.println("Number of Legs    : "+noOfLegs);
        
    }
}