package replit.array2;

import java.util.Scanner;

public class PrintFirstAndLastChar2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        for (int i=0; i< words.length; i++)
        {
            System.out.println(""+words[i].charAt(0) + words[i].charAt(words[i].length() - 1));
        }
    }
}
/**
Given a String array words, iterate through each word and print first and last letter of each element in the format below. Put each first and last letter in an array.
Example:
words → ["hello", "why", "by", "apple" , "note"]
print → [ho, wy, by, ae, ne]
 */