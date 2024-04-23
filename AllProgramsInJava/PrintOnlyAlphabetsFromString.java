package AllProgramsInJava;



public class PrintOnlyAlphabetsFromString
{
    public static void main(String[] args) {

        // print only alphabets from String a ="disha12345fghjk";

        String a = "disha12345";
        a = a.toLowerCase();
        String c = "";
        char[] b = a.toCharArray();
        for (int i = 0; i < b.length; i++) {
            if ((b[i] >= 'a') && (b[i] <= 'z')) {
                c = c + b[i];
            }
        }
        System.out.println(c);

    }
}
