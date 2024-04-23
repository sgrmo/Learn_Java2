package AllProgramsInJava;

public class SwapStringWithoutThirdVariable
{
    public static void main(String[] args) {

        String a = "java";
        String b = "selenium";


        System.out.println("Before swaping \n a : " +a + " b : "+b);

        a = a+b;

        b = a.substring(0, a.length()-b.length());

        a = a.substring(b.length());

        System.out.println("After swaping \n a : " +a + " b : "+b);
    }
}
