
import java.util.*;
class sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] m=new int [n];
        for (int i=0;i<n;i++)
        {
            m[i]=sc.nextInt();
        }
        int c=-1;
        for (int i=0;i<n;i++)
        {
            if (m[i]>c)
            {
                c=m[i];
            }
        }
        System.out.print(c);
    }
}
