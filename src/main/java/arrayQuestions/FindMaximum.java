package arrayQuestions;

public class FindMaximum
{
     /*
        Write a function that can find the maximum number from an int Array
     */
    public static int maxValue(int[]arr)
    {
        int max = Integer.MIN_VALUE;

        for (int each: arr)
        {
            if (each > max)
            {
                max =each;
            }
        }
        return max;
    }

    public static int maxArr(int[] x)
    {
        int max = x[0];

        for (int i=0; i<x.length; i++)
        {
            if (x[i]>max)
            {
                max = x[i];
            }
        }
        return max;
    }

    public static void main(String[] args)
    {
      int[] number = {2,4,5,7,3};
        System.out.println(maxValue(number));
    }
}
