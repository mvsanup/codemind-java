import java.util.*;
class prime
{
    public static boolean pri(int n)
    {
        if (n<2)
            return false;
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
        int e=sc.nextInt();
        int f=sc.nextInt();
        for(int i=e;i<=f;i++)
        {
            if(pri(i))
            {
                System.out.println(i);
            }
        }
    }
}