import java.util.*;
class fib
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a=0,b=1,e;
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.print(a+" ");
            e=a+b;
            a=b;
            b=e;
        }
    }
}