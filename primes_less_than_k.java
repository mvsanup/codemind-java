import java.util.Scanner;
class prime
{
    public static boolean pri(int n)
    {
        if(n<2)
        {
            return false;
        }
        for (int i=2;i<=(int)Math.sqrt(n);i++)
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
        int [] b=new int[a];
        int c=0;
        for (int i=0;i<a;i++)
        {
            b[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        for (int i=0;i<a;i++)
        {
            if(pri(b[i]))
            {
                if(b[i]<=k)
                {
                    c+=1;
                }
            }
        }
        System.out.println(c);
    }
}