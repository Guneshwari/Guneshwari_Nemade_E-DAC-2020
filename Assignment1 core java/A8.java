import java.util.Scanner;
class A8
{
public static void main(String args[] )
{
double pr,i,t,simple;
Scanner s = new Scanner(System.in);
System.out.println("Enter principle amount");
pr =s.nextDouble();
System.out.println("Enter rate of interest");
i=s.nextDouble();
System.out.println("Enter  the time");
t=s.nextDouble();
s.close();

simple = (pr * i *t) / 100;

System.out.println("Simple interest is: "+simple);
}
}
*********************************************************************
C:\Assignment1 core java>javac A8.java

C:\Assignment1 core java>java A8
Enter principle amount
2000
Enter rate of interest
6
Enter  the time
3
Simple interest is: 360.0