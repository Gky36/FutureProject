package replit.arrayList;

import java.util.ArrayList;

public class Set
{
    public static void main(String[] args)
    {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(5);
        nums.add(6);
        nums.add(9);
        System.out.println("Before change to value "+nums);

        nums.set(0,4);
        nums.set(1,10);
        nums.set(2,12);
        nums.set(3,18);
        System.out.println("After change to value " + nums);
    }
}
