import java.util.*;
class count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c=0;
        int n=sc.nextInt();
        int k=sc.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]%k==0)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}