import java.util.*;
class strong 
{
    public static int fact(int n)
    {
        int a=1;
        for(int i=n;i>0;i--)
        {
            a=a*i;
        }
        return a;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b,c,d=0,e;
        e=a;
        while(a!=0)
        {
            b=a%10;
            c=fact(b);
            d+=c;
            a=a/10;
        }
        if(d==e)
        {
            System.out.println("The number "+d+" is a strong number");
        }
        else
        {
            System.out.println("The number "+e+" is not a strong number");
        }
    }
}