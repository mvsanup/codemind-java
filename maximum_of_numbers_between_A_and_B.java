
import java.util.*;
class elements
{
    public static void main(String args[])
    {
        int c=-1;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] m=new int[n];
        for(int i=0;i<n;i++)
        {
            m[i]=sc.nextInt();
        }
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if((m[i]>=a && m[i]<=b)&&(c<=m[i]))
            {
                c=m[i];
            }
        
        }
        System.out.println(c);
        
    }
}
