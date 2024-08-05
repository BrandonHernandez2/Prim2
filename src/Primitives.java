import java.util.stream.StreamSupport;

public class Primitives {

    public static void main(String[] args) {
        //Integer Types

        int myInt = 7;  //32-nit integer or a 4 byte integer. 2 ^ 32 different values.
        System.out.println(myInt);
        short myShort = 8; // 16-bit integer of an 2 byte integer. 2^16 different values.
        System.out.println(myShort);
        byte myByte = 9; // 8-bit integer 2^8 = 256 values. -128 <-> 127
        System.out.println(byte);
        long myLong = 37497192219834001L;


        String myString = "Hello World!";

        char myChar = 'a';

        //

        boolean myBoolean = true; //8 bits
        boolean myBoolean2 = false;


        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE + 1);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Character.MIN_VALUE);
        System.out.println(Character.MIN_VALUE);
    }

}
