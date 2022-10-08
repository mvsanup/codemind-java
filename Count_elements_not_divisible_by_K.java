
import java.util.*;
class div
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,i,c=0;
        a=sc.nextInt();
        b=sc.nextInt();
        int [] d=new int[a];
        for (i=0;i<a;i++)
        {
            d[i]=sc.nextInt();
        }
        for (i=0;i<a;i++)
        {
            if (d[i]%b!=0)
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}
