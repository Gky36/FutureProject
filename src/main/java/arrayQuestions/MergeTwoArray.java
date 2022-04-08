package arrayQuestions;

public class MergeTwoArray
{
     /*
    Write a return method that can concat two arrays
     */

    public static int[] concatTwo(int[] arr1, int[] arr2)
    {
        int[] result = new int[arr1.length +arr2.length];
        int i =0;

        for (int each: arr1)
        {
            result[i++] = each;
        }

        for (int each : arr2)
        {
            result[i++] = each;
        }
        return result;
    }
}
