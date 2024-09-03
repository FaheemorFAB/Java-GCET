//Author: Yaseen
//Date: 03.09.24
//Purpose: Find the factorial of the entered number
import java.util.Scanner;
class FindFact
{
    public static void main(String[] a)
    {
        int fact=1;
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int num=input.nextInt();
        for (int i=num;i>0;i--)
        {
            fact=fact*i;
        }
        System.out.print("The factorial of " + num + " is " + fact);
        input.close();
    }
}