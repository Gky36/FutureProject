package arrayQuestions;

public class FirstUniqueElement
{
     /*
        write a program that can find the first duplicated element from the array
     */

    public static int duplicatedElement(int[] arr)
    {
        int firstDuplicated =0;

        for (int each : arr)
        {
            int frequency =0;
            for(int each2 : arr)
            {
                if (each == each2)
                {
                    frequency++;
                }
            }
            if (frequency > 1)
            {
                firstDuplicated = each;
                break;
            }
        }
        return firstDuplicated;
    }
}
