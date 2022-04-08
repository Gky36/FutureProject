package arrayQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates
{
     /*
    Write a function that can remove the duplicates from an array of integers
     */

    public static int[] removeDuplicates(int[]arr)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for (int each: arr)
        {
            if (!list.contains(each))
            {
                list.add(each);
            }
        }
        arr = new int[list.size()];
        for (int i=0; i< list.size(); i++)
        {
            arr[i] = list.get(i);
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] num ={1,3,3,2,1,5,6,6};
        System.out.println(Arrays.toString(removeDuplicates(num)));
    }
}
