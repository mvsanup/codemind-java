import java.util.*;
class lcm
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int l,g=0;
        for(int i=1;i<=a&&i<=b;++i)
        {
            if(a%i==0 && b%i==0)
            {
                g=i;
            }
        }
        l=(a*b)/g;
        System.out.print(l);
    }
}