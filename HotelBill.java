import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Random;  
/**
 * Simple program that prints information of a Hotel Room.
 * 
 * Project 3
 * @author Neil Correia - Comp 1210 - Module 3
 * @version 4/26/2023
 */   
public class HotelBill {
/**
    * Prints information of a Hotel Room. 
    * @param args Command line arguments - not used.
    */

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Random rand = new Random();
      System.out.print("Enter hotel bill code: ");
      String code = sc.nextLine().trim();
      if (code.length() < 22) {
         System.out.println("\nInvalid Hotel Bill Code.");
         System.out.print("Hotel Bill Code must have " 
            + "at least 22 characters.");
         return;
      }
      
      String room = code.substring(0, 3);
      double price = Double.parseDouble(code.substring(3, 10));
      String date = code.substring(9, 19);
      int nights = Integer.parseInt(code.substring(19, 21));
      String name = code.substring(21);
      double tax = price * 0.15;
      double costPerNight = price * 1.15;
      double totalCost = costPerNight * nights;
      int luckyNum = rand.nextInt(999999) + 1;
   
      DecimalFormat df = new DecimalFormat("$#,##0.00");
      System.out.println("\nName: " + name);
      System.out.println("Room: " + room);
      System.out.println("Check-in Date: " + date);
      System.out.println("Nights: " + nights);
      System.out.print("Cost Per Night: " + df.format(costPerNight) 
         + "   " + "(Room: " + df.format(price) 
         + "   " + "Tax: " + df.format(tax) + ")");
      System.out.println("\nTotal: " + df.format(totalCost));
      System.out.println("Lucky Number: " + String.format("%06d", luckyNum));
   }
}
