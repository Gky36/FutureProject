package arrayQuestions;

public class Reverse
{
     /*
    write a function that can reverse an array
     */
    public static int[] reverse(int[] arr)
    {
        int[] result = new int[arr.length];

        for (int i=arr.length-1, j=0; i>=0; i--, j++)
        {
            result[j] = result[i];
        }

        return result;
    }
}
