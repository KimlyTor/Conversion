/** Minutes.java - converting hours, days, weeks, and years into minutes
 * 
 *  @author ktkay
 */
import java.util.Scanner;

public class Minutes {
    
    public static final void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of years:");
        int years = sc.nextInt();
        System.out.println("Please enter the number of weeks: ");
        int weeks = sc.nextInt();
        System.out.println("Please enter the number of days: ");
        int days = sc.nextInt();
        System.out.println("Please enter the number of hours: ");
        int hours = sc.nextInt();
        
        
        int yearToMin = years*365*24*60;
        int weekToMin = weeks*7*24*60;
        int dayToMin = days*24*60;
        int hourToMin = hours*60;
        
        int total = yearToMin + weekToMin + dayToMin + hourToMin;
        
        System.out.println("You enter: "+ years + " year(s)," +" "+ weeks+" week(s)," +" "+
                           days+" day(s)," +" "+ hours + " hour(s)");
                      
        System.out.println("The total minutes: " + total +" minutes");
        
    }
    
    
}
