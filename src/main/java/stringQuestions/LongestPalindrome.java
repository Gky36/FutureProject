package stringQuestions;

import java.util.ArrayList;

public class LongestPalindrome
{
     /**
        Write a program that can return the longest palindrome from a string
     */
    public static String longestPalindrome(String str)
    {
        String longest= "";
        ArrayList<String> list = new ArrayList<>();

        for (int i=0; i<str.length(); i++)
        {
            for (int j= i+1; j<str.length(); j++)
            {
                list.add(str.substring(i,j));
            }
        }

        for (String each : list)
        {
            String reverse ="";
            for (int i =each.length()-1; i>=0; i--)
            {
                reverse += each.charAt(i);
            }
            if (each.equalsIgnoreCase(reverse) && each.length() > longest.length())
            {
                longest = each;
            }
        }

        return  longest;
    }
}
