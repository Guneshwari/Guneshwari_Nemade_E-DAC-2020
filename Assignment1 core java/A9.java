import java.util.Scanner;
class A9
{
public static void main(String args[] )
{
int days,years,months,weeks;
Scanner s = new Scanner(System.in);
System.out.println("Enter no of days: ");
days = s.nextInt();
years = days / 365;
System.out.println("No of years: "+years);
months = days / 30 ;
System.out.println("No of months: "+months);
weeks= days /  7;
System.out.println("No of weeks: "+weeks);

}
}
***************************************************
C:\Assignment1 core java>java A9
Enter no of days:
60
No of years: 0
No of months: 2
No of weeks: 8