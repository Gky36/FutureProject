package replit.array2;

import java.util.Arrays;
import java.util.Scanner;

public class FrontPiece
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for(int i =0; i < size; i++) {
            num[i] = scan.nextInt();
        }

        int[] numArr = new int[2];
        if (numArr.length >= 2)
        {
            numArr[0] = num[0];
            numArr[1] = num[1];
        }else
        {
            numArr = num;
        }
        System.out.println(Arrays.toString(numArr));
    }
}
/**
 * Given an int array num of any length, print a new array of its first 2 elements. If the array is smaller than length 2, use whatever elements are present.
 *
 * Examples:
 *
 * input: 1, 2, 3
 * ​
 * output: [1, 2]
 * input: 1, 2, 3
 *
 * output: [1, 2]
 * input: 1
 * ​
 * output: [1]
 * input: 1
 *
 * output: [1]
 * input: 4, 5, 4, 3, 8
 * ​
 * output: [4, 5]
 */