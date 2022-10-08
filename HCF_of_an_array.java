
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
        int gcd=arr[0];
        int j=1,i=1;
        while(j<n)
        {
            if(a[j]%gcd==0)
            {
                j++;
            }
            else
            {
                gcd=a[j]%gcd;
                i++;
            }
        }
        System.out.print(gcd);
    }
}
