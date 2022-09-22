
import java.util.*;
class elements
{
    public static void main(String args[])
    {
        int c,e=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] m=new int[n];
        for(int i=0;i<n;i++)
        {
            m[i]=sc.nextInt();
        }
        int a=sc.nextInt();
        int b=sc.nextInt();
        c=b;
        for(int i=0;i<n;i++)
        {
            if((m[i]>=a && m[i]<=b)&&(c>=m[i]))
            {
                e=1;
                c=m[i];
            }
        
        }
        if(e==0)
        {
            System.out.println(-1);
        }
        else
        {
            System.out.println(c);
        }
        
    }
}

