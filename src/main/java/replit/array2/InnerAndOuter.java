package replit.array2;

import java.util.Arrays;
import java.util.Scanner;

public class InnerAndOuter
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int[] outer = new int[scan.nextInt()];
        int[] inner = new int[scan.nextInt()];

        for(int j = 0; j < outer.length; j++) {
            outer[j] = scan.nextInt();
        }

        for(int i = 0; i < inner.length; i++) {
            inner[i] = scan.nextInt();
        }
        Arrays.sort(inner);
        Arrays.sort(outer);

        boolean checker = false;
        for (int i=0; i<outer.length; i++)
        {
            for (int j=0; j<inner.length; j++)
            {
                if (outer[i]==inner[j])
                {
                    checker =true;
                }
            }
        }
        System.out.println(checker);
    }
}
/**
 Given two arrays of ints sorted in increasing order, outer and inner, print out true if all of the numbers in inner appear in outer.
 Take advantage of the fact that both arrays are already in sorted order.

Examples:
input (outer): 1, 2, 4, 6
input (inner): 2, 4

output: true
input (outer): 1, 2, 4, 6
input (inner): 2, 4

output: true
input (outer): 1, 2, 4
input (inner): 6, 5
output: false
 */