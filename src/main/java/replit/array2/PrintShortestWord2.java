package replit.array2;

import java.util.Arrays;
import java.util.Scanner;

public class PrintShortestWord2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] word = str.split(", ");
        Arrays.sort(word);
        String shortest = word[0];
        String newWord ="";

        for (int i=0; i< word.length; i++)
        {
            if (word[i].length() < shortest.length())
            {
              shortest =word[i];
            }
        }
        for (int i=0; i<word.length; i++)
        {
            int count =0;
            if (shortest.length()==word[i].length())
            {
                count++;
                newWord += word[i]+" ";
            }
        }
        String[] temp = newWord.split(" ");
        Arrays.sort(temp);
        System.out.println(Arrays.toString(temp));
    }
}
/**
 *
Write a program that will find out shortest words in the given string str.
If there are few words that are evenly short, print them all. Use split method in order to split str string variable and create an array of strings.
Print array with Arrays.toString() method. Sort array before printing.
Hint: Split values by comma: split(", ");

input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray
output: [cat, old, ray]
 */
