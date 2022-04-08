package stringQuestions;

import java.util.Arrays;

public class Anagram
{
    /**
     *  /*
     *     Write a  function that check if a string is build out of the same letters as another string.
     *             Ex: same("abc", "cab"); -> true , Solution 1:
     *                 same("abc", "abb"); -> false:
     */

    public static boolean same(String a, String b)
    {
        char[] chars = a.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);

        char[] chars1 = b.toCharArray();
        Arrays.sort(chars1);
        String sorted1 = new String(chars1);

        if (sorted.equalsIgnoreCase(sorted1)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(same("abc", "cab"));
        System.out.println(same("abc", "abb"));
    }
}
