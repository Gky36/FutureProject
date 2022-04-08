package replit.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class AppendPosSum
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(appendPosSum(list));

    }

    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> list)
    {
        int sum=0;
        ArrayList<Integer> positiveNum = new ArrayList<>();

        for (int i=0; i<list.size(); i++)
        {
            if (list.get(i) >0)
            {
                positiveNum.add(list.get(i));
                sum += list.get(i);
            }
        }
        positiveNum.add(sum);
        return positiveNum;
    }
}
/**
Create a static method that:
is called appendPosSum
returns an ArrayList of Integers
takes one parameter: an ArrayList of Integers
This method should:
Create a new ArrayList of Integers
Add only the positive Integers to the new ArrayList
Sum the positive Integers in the new ArrayList and add the Sum as the last element
For example, if the incoming ArrayList contains the Integers (4,-6,3,-8,0,4,3),
the ArrayList that gets returned should be (4,3,4,3,14), with 14 being the sum of (4,3,4,3). The original ArrayList should remain unchanged.
 */