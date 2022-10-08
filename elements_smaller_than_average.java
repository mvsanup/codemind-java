import java.util.*;
class sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] a=new int [n];
        for (int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int c=0;
        for (int i=0;i<n;i++)
        {
            c+=a[i];
        }
        double d=c/n;
        int e=0;
        for (int i=0;i<n;i++)
        {
            if (a[i]<=(int)d)
                e+=1;
        }
        System.out.print(e);
    }
}