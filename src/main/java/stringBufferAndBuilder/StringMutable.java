package stringBufferAndBuilder;

public class StringMutable
{
    // StringBuffer and StringBuilder are class
    // These are make the String mutable
    /*
        String Buffer
            is synchronized, thread-safe, which means are safe for by multiple tread

        String Builder
            is non-synchronized not thread safe.
        String Builder is more efficient than StringBuffer
     */
    // Main difference is String Builder does not tread-safe


    public static void main(String[] args)
    {
       StringBuffer str = new StringBuffer("Gokay");
       // adding to String
        str.append("Yazar");
        str.delete(2,3);
        str.insert(3,"k");
        System.out.println("After inserting "+str);
        str.reverse();
        System.out.println("After reverse = " + str);
        str.replace(0,5,"Gokce");

        System.out.println(str);
        System.out.println();

        StringBuilder str2 = new StringBuilder("Gokay");
        str2.append("Yazar");
        str2.insert(5," ");
        System.out.println(str2);


        str2.insert(3," ");
        str2.reverse();
    }
}
