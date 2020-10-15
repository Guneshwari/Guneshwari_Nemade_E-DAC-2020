import java.util.Scanner;
class A21
{
  public static void main(String args[])
  {
    Scanner input = new Scanner( System.in );
    System.out.print("Enter a decimal number : ");
    int num =input.nextInt();

    String octalString = Integer.toOctalString(num);
    System.out.println("Decimal to octal: " + octalString);
 }
}

**************************************************
Enter a decimal number : 15
Decimal to octal: 17