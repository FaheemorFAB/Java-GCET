//Author: Yaseen
//Date: 03.09.24
//Purpose: Check if the entered number is Prime, Composite or Neither
import java.util.Scanner;
class PrimeCheck
{
    public static void main(String[] a)
    {
        int fact=0;
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int n=input.nextInt();
        input.close();
        if(n<0)
        {
            System.out.print("Enter a positive number");
            return;
        }

        else if(n==0 || n==1)
        {
            System.out.print("Neither prime nor composite");
            return;
        }
        for (int i=1;i<n/2;i++)
        {
            if (n%i==0)
            {
                fact++;
            }
        }
        if(fact==1)
        {
            System.out.print("The number is Prime");
        }
        else 
        {
            System.out.print("The number is not Prime But Composite");
        }
        
    }
}