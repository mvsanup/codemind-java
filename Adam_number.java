import java.util.*;
class an
{
    public static boolean adam(int n)
    {
        int a=n;
        int f=n*n,r1=0,r2=0;
        while(n!=0)
        {
            int b=n%10;
            r1=r1*10+b;
            n=n/10;
        }
        r1=r1*r1;
        while(r1!=0)
        {
            int b=r1%10;
            r2=r2*10+b;
            r1=r1/10;
        }
        if(r2==f)
            return true;
        else
            return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(adam(n))
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}