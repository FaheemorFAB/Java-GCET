//Author: Yaseen
//Date: 03.09.24
//Purpose: Sum of an array using ForEach
class SumOfArray
{
    public static void main(String []a)
    {
        int[] Marks={1,2,3,4,5};
        int sum=0;
        for(int item:Marks)
        {
            sum=sum+item;
        }
        System.out.print("The sum of the array is: " + sum);
    }
}