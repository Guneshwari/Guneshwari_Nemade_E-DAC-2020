package Day01;
class Ans13
{
    public static void main(String[] args)
    {
        for(int i=1;i<=6;i++)
        {   for(int k=6;k>=i;k--)
        {
            System.out.print(" ");
        }
            for(int j=2;j<=i*2;j++)
            {
                if(j==2 || j==i*2 || (i==6 && j%2==0))
            {
                System.out.print("*");           
            }
                else
                {
                    System.out.print(" ");
                }
            }
                
           System.out.println(); 
    }
    }
}