package stringQuestions;

public class UniqueCharacters
{
    /**
    Write a return method that can find the unique characters from the String
            Ex: unique("AAABBBCCCDEF") ==> "DEF";
     */

    public String unique(String str)
    {
        String[] arr = str.split("");
        String unique ="";

        for (int i=0; i<arr.length; i++)
        {
            int num =0;
            for (int j=0; j< arr.length; j++)
            {
                if (arr[i].equals(arr[j]))
                {
                    num++;
                }
            }
            if (num ==1)
            {
                unique += arr[i];
            }
        }
        return unique;
    }

    public static void main(String[] args)
    {
        String str = "AAABBBCCCDEF";
        UniqueCharacters uniqueCharacters = new UniqueCharacters();
        System.out.println(uniqueCharacters.unique(str));
    }
}
