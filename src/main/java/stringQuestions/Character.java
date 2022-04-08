package stringQuestions;

import java.util.ArrayList;

public class Character
{
    public static void main(String[] args)
    {
        String str = "ABCD123$%#@&456EFG!";
        ArrayList<java.lang.Character> letters = new ArrayList<>();
        ArrayList<java.lang.Character> digits = new ArrayList<>();
        ArrayList<java.lang.Character> special = new ArrayList<>();

        for (int i=0; i<str.length(); i++)
        {
            char eachChar = str.charAt(i);

            if (java.lang.Character.isLetter(eachChar))
            {
                letters.add(eachChar);
            }
            else if (java.lang.Character.isDigit(eachChar))
            {
                digits.add(eachChar);
            }
            else
            {
                special.add(eachChar);
            }
        }

        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("special = " + special);
    }
}
