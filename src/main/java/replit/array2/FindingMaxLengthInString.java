package replit.array2;

import java.util.Scanner;

public class FindingMaxLengthInString
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        String longestString="";
        for(int i = 0; i < 5;  i++) {
            words[i] = input.nextLine();
        }
        longestString =words[0];

        for (int i=0; i<words.length; i++)
        {
            if (longestString.length() < words[i].length())
            {
                longestString = words[i];
            }
        }
        System.out.println("longestString = " + longestString);
    }
}
/**
Given the array words find and print the word with the largest length. Assume that there are no 2 words with longest len

Example:
words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
Outputs: jaaaaavvaaaaaaaaaa
 */