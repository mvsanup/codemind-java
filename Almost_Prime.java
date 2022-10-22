import java.util.*;
class almost
{
    public static boolean pri(int n)
    {
        if (n<2)
            return false;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static boolean alm(int n)
    {
        for (int i=2;i<n;i++)
        {
            for (int j=2;j<n;j++)
            {
                if (pri(i) && pri(j) && i!=j && i*j==n)
                    return true;
            }
        }
        return false;
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int k=0;k<t;k++)
        {
            int n=sc.nextInt();
            if (alm(n))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
            
            