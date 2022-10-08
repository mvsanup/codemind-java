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
        int k=sc.nextInt();
        int s=0;
        for (int i=0;i<n;i++)
        {
            if (a[i]!=k)
            {
                s=s+a[i];
            }
            else
                break;
        }
        System.out.println(s+k);
    }
}