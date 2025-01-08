import java.util.*;

public class CelsiusToFahrenheit{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Celsius value");
	double Celsius=sc.nextDouble();
	double Fahrenheit = (Celsius * 9/5) + 32;
	System.out.println("Result: " + Fahrenheit + " Fahrenheit");
}
}