package replit.arrayList;

import java.util.ArrayList;

public class Insert
{
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<>();
        names.add("Gokay");
        names.add("Askin");
        names.add("Burak");
        names.add("Kadir");

        names.add(2,"Koray");
        names.add(names.size()-1,"Mustafa");

        System.out.println("names = " + names);
    }
}
/**
The last ArrayList method we are going to learn is... .add() again!
Except this time, instead of .add() taking one parameter (the thing we want to add), this time, we will be giving it two parameters. The two parameters are:
.add(i,element)
.add(i,element)
i ==> the index you want to insert at
element ==> the element you want to insert at index i
i ==> the index you want to insert at
element ==> the element you want to insert at index i

For example, if you had an ArrayList called nums with the values (4,2,5,6), and you run the following:
nums.add(1,100);
nums.add(1,100);
The result will be (4,100,2,5,6)

Task: Given an ArrayList of Strings called words, insert "hey" in the 0th index and then insert "yo" in the 3rd index.
 */