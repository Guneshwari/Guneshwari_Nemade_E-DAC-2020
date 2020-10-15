import java.util.Scanner;

public class A19
{
public static void main(String[] args) {

Scanner decimal = new Scanner(System.in);
System.out.print("Enter decimal number:- ");
long Number = decimal.nextLong();

String Binary = Long.toBinaryString(Number);
System.out.println(Binary);

}
}

********************************************

Enter decimal number:- 2
10