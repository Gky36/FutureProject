package replit.array2;

import java.util.Scanner;

public class ReverseSentence
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String[] arr = sentence.split(" ");
        String reverse ="";

        for (int i= arr.length-1; i>=0; i--)
        {
            reverse += arr[i]+" ";
        }
        System.out.println(reverse);
    }
}
/**
Given a String variable sentence, write code to get each word and assign to String reversed in reverse order.

Example:
sentence -> Java is fun
reversed > fun is Java
 */
