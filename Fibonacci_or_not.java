import java.util.*;
class fib 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,c=0,a=0,b=1,e;
        n=sc.nextInt();
        while(a<=n)
        {
            if(a==n)
            {
                c=1;
                break;
            }
            e=a+b;
            a=b;
            b=e;
        }
        if(c==1)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}