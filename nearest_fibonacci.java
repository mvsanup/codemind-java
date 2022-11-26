import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1,r=0;
        int t[]=new int[n];
        for(int i=1;i<=n;i++)
        {
            t[i-1]=a;
            int c=a+b;
            a=b;
            b=c;
        }
        for(int i=0;i<n;i++)
        {
            if(t[i]>n)
            {
                r=i;
                break;
            }
        }
        if(n-t[r-1]==t[r]-n)
        {
            System.out.print(t[r-1]+" "+t[r]);
        }
        else if(n-t[r-1]>=t[r]-n)
        {
            System.out.print(t[r]);
        }
        else
        {
            System.out.print(t[r-1]);
        }
    }
}