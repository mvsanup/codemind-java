import java.util.*;
class cp
{
    public static boolean pri(int n)
    {
        int r=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                r++;
            }
        }
        if(r==2)
        {
            return true;
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=n,b=0;
        while(n>0)
        {
            b=b*10+(n%10);
            n=n/10;
        }
        if(pri(a))
        {
            if(pri(b))
            {
                System.out.println("circular prime");
            }
            else
            {
                System.out.println("prime but not a circular prime");
            }
        }
        else
        {
            System.out.println("not prime");
        }
    }
}