package replit;

import java.util.Arrays;
import java.util.Scanner;

public class FrontPiece
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] num = new int[size];
        for (int i=0; i< num.length; i++)
        {
            num[i]= scanner.nextInt();
        }

        int[] newArr = new int[2];
        if (size >=2)
        {
            newArr[0] = num[0];
            newArr[1] = num[1];
        }else
        {
            newArr = num;
        }
        System.out.println(Arrays.toString(newArr));
    }
}
