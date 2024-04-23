package AllProgramsInJava;

public class SwapString
{
    public static void main(String[] args) {

        String a = "java";
        String b = "selenium";

        System.out.println("Before swaping \n a : " +a + " b : "+b);

        String c = a;
        a = b;
        b = c;

        System.out.println("After swaping \n a : " +a + " b : "+b);
    }
}
