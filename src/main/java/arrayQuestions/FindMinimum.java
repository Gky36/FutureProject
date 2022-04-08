package arrayQuestions;

public class FindMinimum
{
     /*
    Write a function that can find the maximum number from an int Array
     */
    public static int minValue(int[] arr)
    {
        int min = Integer.MAX_VALUE;
        for (int each : arr)
        {
            if (each < min)
            {
                min = each;
            }
        }
        return min;
    }

    public static int min(int[] arr)
    {
        int min = arr[0];
        for (int i=0; i<arr.length; i++)
        {
            if (arr[i] <min)
            {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] number = {2,4,5,7,3};
        System.out.println(minValue(number));
        System.out.println(min(number));
    }
}
