import java.util.*;
class des
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        int [] a=new int[50];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]>a[i+1])
            {
                c+=1;
            }
        }
        if(c==n-1)
        {
            System.out.println("no");
        }
        else
            System.out.println("yes");
    }
}