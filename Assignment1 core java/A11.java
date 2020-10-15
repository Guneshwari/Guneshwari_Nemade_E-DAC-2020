class A11
{
public static void main(String args[] )
{
int x=890,y=65;
System.out.println("Before swap: "+ x +" "+ y);
x=x + y;
y=x - y;
x=x - y;
System.out.println("Swap: "+ x + " "+y);
}
}

************************************************************
C:\Assignment1 core java>javac A11.java

C:\Assignment1 core java>java A11
Before swap: 890 65
Swap: 65 890