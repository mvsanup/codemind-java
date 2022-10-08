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
        int k=sc.nextInt();
        for (int i=0;i<n;i++)
        {
            if (a[i]==k)
                c=1;
        }
        if (c>0)
            System.out.print("True");
        else
            System.out.print("False");
    }
}