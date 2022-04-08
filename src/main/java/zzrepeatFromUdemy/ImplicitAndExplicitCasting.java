package zzrepeatFromUdemy;

public class ImplicitAndExplicitCasting {
    public static void main(String[] args)
    {
        byte x = 100;
        int z = x;
        System.out.println(x);
        long k = x;

        char ch ='A';
        int a = ch;
        System.out.println(a);

        // higher to lower which is explicit casting

        int i = 100;
        byte b = (byte) i;

        int d = 97;
        char chh = (char) d;
        System.out.println(chh);

        int m = 612;
        byte n = (byte) m;
        char o = (char) n;
    }
}
/**
    Implicit casting is automatically taking care of it, so we do not need any work.
        - lower -> higher
        - byte -> int

    Explicit casting is required some work so we have handle it.
        higher -> lower
        int -> byte
 */