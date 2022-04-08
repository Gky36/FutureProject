package stringQuestions;

public class CountWord
{
    public static void main(String[] args)
    {
        String str = "2juMp41EEEkd4s4";
        int upperCase = 0;
        int lowerCase = 0;
        int number =0;

        for (int i=0; i<str.length(); i++)
        {
            char eachLetter = str.charAt(i);
            if (eachLetter >='A' && eachLetter <='Z')
            {
                upperCase++;
            }else if ((eachLetter >='a' && eachLetter <='z'))
            {
                lowerCase++;
            }else if (eachLetter >='0' && eachLetter <=9)
            {
                number++;
            }
        }
        System.out.println("upperCase = " + upperCase);
        System.out.println("lowerCase = " + lowerCase);
        System.out.println("number = " + number);

        String str2 = "java is fun. java class today, not javascript";
        int count =0;

        for (int i=0; i <str2.length()-3; i++)
        {
            String eachForLetter =str2.substring(i,i+4);
            if (eachForLetter.contains("java"))
            {
                count++;
            }

        }
        System.out.println("count = " + count);
    }
}

