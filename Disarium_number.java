import java.util.*;
class dn
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=n;
        int b=(int)Math.log10(n);
        int c=1,r=0;
        while(n!=0)
        {
            int d=n/(int)Math.pow(10,b);
            r+=(int)Math.pow(d,c++);
            n=n%(int)Math.pow(10,b);
            b--;
        }
        if(a==r)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}