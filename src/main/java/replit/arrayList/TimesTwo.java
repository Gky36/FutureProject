package replit.arrayList;

import java.util.ArrayList;

import java.util.Scanner;

public class TimesTwo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(timesTwo(list));
    }
    public static ArrayList<Integer> timesTwo(ArrayList<Integer> nums)
    {
        ArrayList<Integer> timesDouble = new ArrayList<>();

        for (int i=0; i<nums.size(); i++)
        {
            timesDouble.add(nums.get(i)*2);
        }
        return timesDouble;
    }
}
/**
Create a method that:
is called timesTwo
returns an ArrayList of Integers
takes in a single parameter - an ArrayList of Integers called nums
This method should take the ArrayList parameter and multiply every value by two.
 */