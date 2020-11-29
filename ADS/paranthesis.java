package ADS;
class paranthesis
{   
   static int countopen=0;
   static int countclose=0;
    void push(char i)
    {
        if(i=='(')
        {
       countopen++;
       
        }
      //  System.out.println(countopen);
    }
    void pop(char i)
    {
        if(i==')')
        {
           countclose++;
        }
    }
}
class Arrayelementin 
{
    public static void main(String[] args)
    {
        paranthesis obj=new paranthesis();
        String s=("()))");
       for (int i=0; i<s.length();i++)
       {
           obj.push(s.charAt(i));
       }
     
       for (int i=0; i<s.length();i++)
       {
           obj.pop(s.charAt(i));
       }
       if(paranthesis.countopen== paranthesis.countclose)
       {
           System.out.println("blanced");
       }
       else
       {
           System.out.println("unbalnced");
       }
    }
}
