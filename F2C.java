/** F2C.java - converting Fahrenheit to Celsius
 * 
 *  @author ktkay
 */
import java.util.Scanner;

public class F2C {
    
    public static final void main(String[] args) {
        
        System.out.println("Please input a temperature in Fahrenheit:");
        Scanner sc = new Scanner (System.in);
        int fahrenheit = sc.nextInt(); // take in Fahrenheit vaues
        int celcuis;
        
        celcuis = (fahrenheit-32)*5/9; // formular to convert Fahrenheit to Celcuis
        
        System.out.println(fahrenheit+" Fahrenheit" +" = " + celcuis +" Celsius");
       
         
        
        
    }
    
    
}
