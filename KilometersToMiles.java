
import java.util.Scanner;

public class KilometersToMiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
        System.out.print("Enter the Kilometers: ");
        double Kilometers = scanner.nextDouble();

        double Miles = Kilometers * 0.621371;

       
        System.out.println("Result: " + Miles + " Miles");
   
        scanner.close();
    }
}