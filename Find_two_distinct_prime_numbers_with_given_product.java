import java.util.*;
class prime
{
    public static boolean pri(int n)
    {
        if(n<2)
        {
            return false;
        }
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int d=0,c=0,b=0;
        for(int i=1;i<a;i++)
        {
            for(int j=2;j<a;j++)
            {
                if(pri(i) && pri(j))
                {
                    if(i*j==a)
                    {
                        b=1;
                        d=i;
                        c=j;
                        break;
                    }
                }
            }
        }
        if(b==1)
        {
            System.out.print(c+" ");
            System.out.print(d);
        }
        else
        {
            System.out.print(-1);
        }
    }
}