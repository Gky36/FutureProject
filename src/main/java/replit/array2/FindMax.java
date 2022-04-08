package replit.array2;

import java.util.Scanner;

public class FindMax
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int max = nums[0];
        for (int i=0; i< nums.length; i++)
        {
            if (max<nums[i])
            {
                max =nums[i];
            }
        }
        System.out.println("max = " + max);
    }
}
/**
 Given an array num, get the max number in the array and print it out to the console.

 nums → [2, 4, 2, 3, -2]) → 4
 nums → [2, 2, 5, 3, 0 ]) → 5
 nums → [1, 33, 5, 7, 9]) → 33
 */