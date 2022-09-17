import java.util.*;
class prime
{
    public static boolean prime(int a)
    {
        if (a<2)
             return false;
        for(int i=2;i<=(int)Math.sqrt(a);i++)
        {
            if(a%i==0)
                 return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int c=0;
        for(int i=n;i<=m;i++)
        {
            if(prime(i))
            {
                c++;
            }
        }
        System.out.println(c);
    }
}