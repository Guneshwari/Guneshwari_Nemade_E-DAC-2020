class A13
{
public static void main(String args[] )
{
int n1=12,n2=10,n3=7,max;
max=(n1 > n2)?  
          (n1 > n3 ? n1 : n3) :  
          (n2 > n3 ? n2 : n3); 

System.out.println("Largest number among " + n1 +  
                             ", " + n2 + " and " + n3 +  
                                 " is " + max + ". " );

}
}
***************************************************
C:\Assignment1 core java>javac A13.java

C:\Assignment1 core java>java A13
Largest number among 12, 10 and 7 is 12.
