//Author: Yaseen
//Date: 03.09.24
//Purpose: Check if the entered number is even or odd
import java.util.Scanner;
class EvenOdd
{
    public static void main(String[] a)
    {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int n=input.nextInt();
        if(n%2==0)
        {
            System.out.print("The number is even");
        }
        else 
        {
            System.out.print("The number is odd");
        }
        input.close();
    }
}