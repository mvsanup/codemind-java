import java.util.*;
class fact
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt(),d=1;
            for(int j=2;j<=n;j++)
            {
                d*=j;
            }
            System.out.println(d);
        }
    }
}