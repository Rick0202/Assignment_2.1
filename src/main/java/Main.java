import java.util.Scanner;

// Richard Harootunian

public class Main {
  public static void main(String[] args) {
      
    double fahr = 0;
    
    Scanner scanner = new Scanner(System.in);
               // This program accepts a temperture reading in degress celsius and converts the temperature to degress fahrenheit.
      
      System.out.print("This program converts degress Celsius to Fahrenheit. Enter a temperature in celsius: ");
      double celsius = scanner.nextDouble();
      fahr = (celsius * 9 / 5) + 32;
      System.out.println("\nYou entered: " + celsius + " Celsius and this conversts to: " + fahr + " Fahrenheit.");
    
        }
    }

  
  
  
  
    
  

 