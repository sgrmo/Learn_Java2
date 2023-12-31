package TypeCasting;

public class ExplicitCasting {
    public static void main(String[] args) {
        //In this casting is manually done by programmer
        // it is process of converting smaller datatype to bigger datatype called as implicit type casting

        short s = 53;
        int i = s;
        //Widening is the process of converting lower type to higher type. This is safe conversion.

        byte b = 10;
        int a = b;
        //Narrowing is the process of converting higher type to lower type.
        int a1 = 300;
        //byte b = a;
        byte b1 = (byte) a;

    }
}
