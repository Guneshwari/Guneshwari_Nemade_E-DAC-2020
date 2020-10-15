import java.util.Scanner;
class A6
{
public static void main(String args[] )
{
double radius,area;
Scanner s = new Scanner(System.in);
System.out.println("Enter radius of circle");
radius=s.nextDouble();
area=Math.PI * (radius * radius);
System.out.println("Area of circle is "+area);
}

}

***********************************************************
C:\Assignment1 core java>javac A6.java

C:\Assignment1 core java>java A6
Enter radius of circle
1
Area of circle is 3.141592653589793