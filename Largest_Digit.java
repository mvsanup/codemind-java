import java.util.*;
class largest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b,n=0;
        while(a!=0)
        {
            b=a%10;
            if(b>n)
            {
                n=b;
            }
            a=a/10;
        }
        System.out.print(n);
    }
}