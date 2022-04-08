package replit.array2;

import java.util.Scanner;

public class FindNonDuplicated
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int nonDuplicated =0;
        for (int i=0; i<nums.length; i++)
        {
            int count =0;
            for (int j=0; j<nums.length; j++)
            {
                if (nums[i]==nums[j])
                {
                    count++;
                }
            }
            if (count==1)
            {
                nonDuplicated =nums[i];
            }
        }
        System.out.println("nonDuplicated = " + nonDuplicated);
    }
}
/**
Given an array nums with 7 integers every element is repeated twice - except one. Find that element and print it to console.
Example:

nums -> [1, 1, 2, 3, 4, 3, 4] -> 2
 */