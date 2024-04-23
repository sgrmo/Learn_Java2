package veljavaprograms;

public class PalindromNumber
{
    public static void main(String[] args) {

        int num =121;

        int temp;
        int rev=0;
        int arms = num;
        while (num>0)
        {
            temp = num%10;
            rev = rev*10 +temp;
            num = num/10;
        }


        System.out.println(rev);

        if(arms == rev)
        {
            System.out.println("Palindrom number");
        }
        else {
            System.out.println(" not a palindrom number");
        }

    }
}
