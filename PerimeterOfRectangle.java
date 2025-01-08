import java.util.*;

public class PerimeterOfRectangle{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter length Of Rectangle");
double length=sc.nextDouble();
System.out.println("Enter width Of Rectangle");
double width=sc.nextDouble();
double Perimeter = 2 * (length + width);
System.out.println("Perimeter Of Rectangle: " + Perimeter);
}
}