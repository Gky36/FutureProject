package stringQuestions;

public class FirstUniqueCharacter
{
    /**
     *  write a program that can return the first non-repeated character from a string
     */
    public  static  char firstNonRepeatedChar(String str) {

        for(char each : str.toCharArray())
        {
            if (str.indexOf(each) == str.lastIndexOf(each))
            {
                System.out.println("First non-repeating character is: "+ each);
                break;
            }
        }
        return ' ';

//        for (int i = 0; i < str.length(); i++) {
//
//            int frequency = 0;
//
//            for (int j = 0; j < str.length(); j++) {
//                if (str.charAt(i) == str.charAt(j)) {
//                    frequency++;
//                }
//            }
//
//            if (frequency == 1) {
//                return str.charAt(i);
//            }
//        }
//        return ' ';
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeatedChar("abcabcdabc"));
    }
}
