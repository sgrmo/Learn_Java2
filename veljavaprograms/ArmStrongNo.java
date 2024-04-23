package veljavaprograms;

public class ArmStrongNo
{
    public static void main(String[] args) {

        int num =1634;

        int temp;
        int rev=0;
        int arms = num;
        while (num>0)
        {
            temp = num%10;
            rev = rev +temp*temp*temp*temp;
            num = num/10;
        }


        System.out.println(rev);

        if(arms == rev)
        {
            System.out.println("ArmStrong number");
        }
        else {
            System.out.println(" not a armstrong number");
        }
    }
}
