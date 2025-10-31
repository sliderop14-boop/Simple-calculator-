import java.util.*;
public class simplecalculator
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        double a=0.0;
        double b=0.0;
        char c;
        double d=0.0;
        System.out.println("Enter a number");
        a=in.nextDouble();
        System.out.println("Enter a number");
        b=in.nextDouble();
        System.out.println("Enter an operator *,/,+,- ");
        c = in.next().charAt(0);
        switch(c)
        {
         case '+':
         d=a+b;
         System.out.println(d);
         break;
         case '-':
         d=a-b;
         System.out.println(d);
         break;
         case '*':
         d=a*b;
         System.out.println(d);
         break;
         case'/':
         d=a/b;
         System.out.println(d);
         break;
         default:
         System.out.println("Please try again.");
         break;
        }
    }
}