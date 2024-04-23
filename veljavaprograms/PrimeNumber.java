package veljavaprograms;

public class PrimeNumber
{
    public static void main(String[] args) {
        int n = 11;
        boolean flag = true;

        for(int i=2; i<n-1; i++ )
        {
            if(n%2 == 0)
            {
                flag = false;
            }
        }

        if(flag)
        {
            System.out.println(" number is prime");
        }
        else
        {
            System.out.println("number is not prime");
        }
    }
}
