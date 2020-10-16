import java.util.Scanner;
class A14
{
	public static void main(String arg[])	
	{
	    long a,y,c;
             	    Scanner sc=new Scanner(System.in);
	    System.out.print("enter  any  calendar year :");
                   y=sc.nextLong();	     
	    if(y!=0)
	    {
		a=(y%400==0)?(c=1):((y%100==0)?(c=0):((y%4==0)?(c=1):(c=0)));       
		if(a==1) 
		    System.out.println(y+" is a leap year");       
               	else
		    System.out.println(y+" is not a leap year");                       
	    }
	    else
		System.out.println("year zero does not exist ");                       
 	}
}

**********************************************************************
C:\Assignment1 core java>java A14
enter  any  calendar year :2215
2215 is not a leap year

C:\Assignment1 core java>java A14
enter  any  calendar year :2016
2016 is a leap year