import java.util.*;
class pal
{
    public static boolean pal(int n)
    {
        int a=0,d,c;
        c=n;
        while(n!=0)
        {
            d=n%10;
            a=a*10+d;
            n=n/10;
        }
        if(c==a)
        {
            return true;
        }
        else
            return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        if(pal(d))
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}