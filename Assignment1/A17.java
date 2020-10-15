import java.util.Scanner;

public class A17{
public static void main(String[] args) {
String b1, b2;

Scanner sc = new Scanner(System.in);
System.out.print("Enter 1st binary number: ") ;
b1 = sc.next();
System.out.print("Enter 2nd binary number: ") ;
b2 = sc.next();
int n1 = Integer.parseInt(b1, 2);
int n2 = Integer.parseInt(b2, 2);
int sum = n1 + n2;
String result = Integer.toBinaryString(sum);
System.out.println("Sum of two binary numbers: " + result);

sc.close();
}
}

***************************************
Enter 1st binary number: 11
Enter 2nd binary number: 01
Sum of two binary numbers: 100