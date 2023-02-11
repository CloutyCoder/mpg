import java.util.Scanner;

public class Assignment1_2 {
   public static void main(String[] args) {
      
      // User information
      String name;
      double pricePerGal, mpg, milesDriven, fillUp, tripPrice;
      int startOdom, endOdom; 
      
      // Receiving input from user
      Scanner input = new Scanner(System.in);
      
      // Questions asking for information
      System.out.println("What is your name?");
      name = input.nextLine();
      
      System.out.println("Hello " + name + ", Enter the price per gallon");
      pricePerGal = input.nextDouble();
      
      System.out.println("Enter total price for fill up");
      fillUp = input.nextDouble();
      
      System.out.println("What is the odometer reading at the start of your trip?");
      startOdom = input.nextInt();
      
      System.out.println("What is the odometer reading at the end of your trip?");
      endOdom = input.nextInt();
      
      // Calculating total miles driven
      milesDriven = endOdom - startOdom;
      System.out.print(name + "! " + "You have traveled " + milesDriven + " miles ");
      
      
      // Number of gallons used & mpg
      int numOfGal = (int)(fillUp / pricePerGal);
      mpg = milesDriven / numOfGal;
      
      System.out.print("using " + numOfGal);
      System.out.println(" gallons of fuel.");
      System.out.print("You averaged ");
      System.out.printf("%.1f", mpg);
      System.out.print(" miles per gallon.");
      
   }
}