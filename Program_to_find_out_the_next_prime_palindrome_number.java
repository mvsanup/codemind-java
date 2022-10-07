
import java.util.*;
class nex
{
    public static boolean pri(int n)
    {
        if (n<2)
        {
            return false;
        }
        for (int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if (n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static boolean pal(int n)
    {
        int a=n,r,c=0;
        while(n!=0)
        {
            r=n%10;
            c=c*10+r;
            n=n/10;
        }
        if (c==a)
        {
            return true;
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        n=n+1;
        while (n!=0)
        {
            if (pal(n) && pri(n))
            {
                System.out.println(n);
                break;
            }
            n+=1;
        }
    }
}
