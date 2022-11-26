import java.util.*;
class sdn
{
    public static boolean sel(int n)
    {
        int e=n,g;
        while(n!=0)
        {
            g=n%10;
            if(g==0)
            {
                return false;
            }
            if(e%g!=0)
            {
                return false;
            }
            n=n/10;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int o=sc.nextInt();
        for(int i=m;i<=o;i++)
        {
            if(sel(i))
            {
                System.out.print(i+" ");
            }
        }
    }
}