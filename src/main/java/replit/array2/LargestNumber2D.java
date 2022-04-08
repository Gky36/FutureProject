package replit.array2;

import java.util.Scanner;

public class LargestNumber2D
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];
        for(int i=0 ;i<=rows-1;i++)
        {
            for(int j=0 ;j<=cols-1;j++)
            {
                arr[i][j]=inp.nextInt();
            }
        }

        int biggestNumber = arr[0][0];
        for (int i=0; i< arr.length; i++)
        {
            for (int j=0; j<arr[i].length;  j++)
            {
                if (biggestNumber < arr[i][j])
                {
                    biggestNumber = arr[i][j];
                }
            }
        }
        System.out.println("biggestNumber = " + biggestNumber);
    }
}
/**
Given a 2d array of ints, find the biggest number(int) in the array and print it.
 */
