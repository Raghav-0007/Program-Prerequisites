import java.util.*;

public class VolumeOfCylinder{
public static void main (String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter radius of Cylinder");
double radius=sc.nextDouble();
System.out.println("Enter height of Cylinder");
double height=sc.nextDouble();
double Volume = 3.14 * radius* radius * height;
System.out.println("Volume of Cylinder: " + Volume);
}
}