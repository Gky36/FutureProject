package arrayQuestions;

import java.util.Arrays;

public class MoveAllZerosToTheEnd
{
    /*
    write a program that can move all the zeros to the end of an array
     */

    public static int[] moveZerosToTheEnd(int[]arr)
    {
        int[] result = new int[arr.length];
        int count =0;
        for(int each : arr)
        {
            if (each != 0)
            {
                result[count++] = each;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2,4,0,3,0,1,6};
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(moveZerosToTheEnd(nums)));
    }
}
