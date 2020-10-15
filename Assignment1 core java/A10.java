import java.util.Scanner;
class A10
{
public static void main (String args[] )
{
int f,c;
Scanner s = new Scanner (System.in);
System.out.println("Enter Fahrenheit : ");
f = s.nextInt();

c= 5*(f-32)/9;
System.out.println("Celsius is: "+c);
}
}
*******************************************************
C:\Assignment1 core java>java A10
Enter Fahrenheit :
100
Celsius is: 37

C:\Assignment1 core java>