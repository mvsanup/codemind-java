import java.util.*;
class reverse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=0,n;
        while(a!=0)
        {
            n=a%10;
            b=b*10+n;
            a=a/10;
        }
        System.out.print(b);
    }
}