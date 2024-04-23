package veljavaprograms;

public class WithoutUsingForLoopPrint1_10
{
    public static void main(String[] args) {

        WithoutUsingForLoopPrint1_10 w = new WithoutUsingForLoopPrint1_10();
        w.myMethod(1);

    }

    public void myMethod(int n)
    {
        if(n<=10)
        {
            System.out.println(n);
            myMethod(n+1);
        }

    }

}
