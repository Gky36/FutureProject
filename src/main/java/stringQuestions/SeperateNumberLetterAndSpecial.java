package stringQuestions;

import java.util.ArrayList;

public class SeperateNumberLetterAndSpecial
{
    public static void main(String[] args)
    {
        String str = "ABCD123$%#@&456EFG!";
        ArrayList<java.lang.Character> letter = new ArrayList<>();
        ArrayList<java.lang.Character> number = new ArrayList<>();
        ArrayList<java.lang.Character> specialChar = new ArrayList<>();

        for (int i=0; i<str.length(); i++)
        {
            char eachChar = str.charAt(i);
            if (java.lang.Character.isLetter(eachChar))
            {
                letter.add(eachChar);
            }else if (java.lang.Character.isDigit(eachChar))
            {
                number.add(eachChar);
            }else
            {
                specialChar.add(eachChar);
            }
        }
        System.out.println("letter = " + letter);
        System.out.println("number = " + number);
        System.out.println("specialChar = " + specialChar);
    }
}
