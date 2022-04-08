package arrayQuestions;

public class ReverseStringAndSpace
{
    public static void main(String[] args)
    {
        String str = "I am a tester in java";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb);

        String[] arr = sb.toString().split(" ");
        String word ="";
        for (int i =2; i<arr.length; i++)
        {
             word = arr[i]+" ";
        }

        System.out.println(word);


    }
}
