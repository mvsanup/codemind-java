import java.util.*;
class happy
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b;
        while(n!=0)
        {
            b=n%10;
            a+=Math.pow(b,2);
            n=n/10;
            if(n==0 && a>9)
            {
                n=a;
                a=0;
            }
        }
        if(a==1 || a==7)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}