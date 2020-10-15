import java.util.Scanner;
class A7
{
public static void main(String args[] )
{
       int markArray[] = new int[5];
        int i;
        float sum=0;
        float percentage;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter marks for 5 Subjects : ");
        for(i=0; i<5; i++)
       {
            markArray[i] = scan.nextInt();
            sum = sum + markArray[i];
        }
		
        
        percentage = (sum/500) * 100;
       System.out.println("Percentage marks= "+percentage+"%");
}
}

*********************************************************************
C:\Assignment1 core java>java A7
Enter marks for 5 Subjects : 67
87
74
98
84
Percentage marks= 82.0%