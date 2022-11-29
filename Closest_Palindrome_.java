import java.util.*;
class cp
{
    public static boolean pal(int n)
    {
        int r=0;
        int a=n;
        while(n!=0)
        {
            int b=n%10;
            r=r*10+b;
            n=n/10;
        }
        if(a==r)
            return true;
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c,d;
        c=n-1;
        d=n+1;
        while(c!=0)
        {
            if(pal(c))
            {
                break;
            }
            c--;
        }
        while(d!=0)
        {
            if(pal(d))
            {
                break;
            }
            d++;
        }
        if(Math.abs(c-n)>Math.abs(d-n))
        {
            System.out.println(d);
        }
        else if(Math.abs(c-n)<Math.abs(d-n))
        {
            System.out.println(c);
        }
        else
        {
            System.out.print(c);
            System.out.print(' ');
            System.out.print(d);
        }
    }
}