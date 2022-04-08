package arrayQuestions;

public class FindSecondBiggestNumber
{
    public static int findSecondBiggest(int[] arr)
    {
        // Each Loop ve Asagida da Tradional loop
        int max =arr[0];
        int secondMax = arr[0];

        for (int each: arr)
        {
            if (each > max)
            {
                secondMax =max;
                max =each;
            }
            if (each >secondMax && each<max)
            {
                secondMax =each;
            }
        }

        return secondMax;
    }


    public static int findSecond(int[] arr)
    {
        int max = arr[0];
        int secondMax = arr[0];

        for (int i=0; i<arr.length; i++)
        {
            if (arr[i] > max)
            {
               secondMax = max;
               max =arr[i];
            }
            if (arr[i] > secondMax && max > arr[i])
            {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        int[] number = {2,4,5,7,3,9};
        System.out.println(findSecondBiggest(number));
        System.out.println(findSecond(number));
    }


}
