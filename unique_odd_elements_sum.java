import java.util.*;
class odd
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] a=new int[n];
        int s=0;
        for (int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++)
        {
            int c=0;
            for (int j=0;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    c++;
                    if(c==1)
                    {
                        if(a[i]%2!=0)
                        {
                            s+=a[i];
                        }
                    }
                    if(j>i)
                        a[j]=0;
                }
            }
        }
       System.out.println(s); 
    }
}