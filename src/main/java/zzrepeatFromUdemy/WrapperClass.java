package zzrepeatFromUdemy;

public class WrapperClass
{
    public static void main(String[] args)
    {
        // int to Integer type
        int x = 100;
        Integer y = Integer.valueOf(x);
        int z = y.intValue();

        // Primitive To String
        byte xx = 100;
        String s = Byte.toString(xx);
        byte yy = Byte.parseByte(s);

        // String to Object and Object to String
        long xxx = 1000;
        Long yyy = Long.valueOf(xxx);
        String ss = yyy.toString();

    }
}
/**
 *  Primitive types --> Wrapper Classes --> Object Types
        - Collections API Types only works for Object types

        - Primitive To Object --> boxing
        - Object to Primitive --> unboxing

 */