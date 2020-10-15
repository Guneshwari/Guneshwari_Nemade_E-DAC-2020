import java.util.Scanner;
class A20
{
    public static void main(String args[])
    {
      Scanner input = new Scanner( System.in );
      System.out.print("Enter a decimal number : ");
      int num =input.nextInt();
        
      String str = Integer.toHexString(num);
      System.out.println("Hexadecimal: "+str);
    }
}


************************************************
Enter a decimal number : 15
Hexadecimal: f