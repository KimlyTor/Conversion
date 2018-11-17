/** Change.java - direct a cashier how to give change
 * 
 *  @author ktkay
 */
import java.util.Scanner;

public class Change {
    
    public static final void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Please enter amount due in USD:");
        double amountDue = sc.nextDouble(); // takes in amountDue from the user
        System.out.println("Please enter amount recieved in USD:");
        double amountRecieved = sc.nextDouble();// takes in amountRecieved from the user
        
        double changeRaw = amountRecieved - amountDue;// return changes in decimal
        
        
        int change = (int)(Math.ceil(changeRaw*100));// return total changes in pennies
        int dollars = Math.round((int)change/100);// return changes in rounded dollar
        
        int change1 = change%100;
        int quarters= Math.round((int)change1/25);// return excess changes in quarter
        
        int change2 = change1%25;
        int dimes   = Math.round((int)change2/10);// return excess changes in dimes
        
        int change3 = change2%10;
        int nickels = Math.round((int)change3/5);// return excess changes in nickels
        
        int change4 = change3%5;
        int pennies = Math.round((int)change4/1);// return excess changes in pennies
         
        System.out.println("Changes amount:");
        System.out.println("Dollar(s):  " + dollars);
        System.out.println("Quarter(s): " + quarters);
        System.out.println("Dime(s): " + dimes);
        System.out.println("Nickel(s): " + nickels);
        System.out.println("Pennies: " + pennies);
    }
    
}


// the formulars to find dollars, quarters, dimes, nickels, and pennies'
// are taken from stackoverflow.com with direct link below:
// https://stackoverflow.com/questions/25796079/java-class-to-break-down-change-into-coins
  
