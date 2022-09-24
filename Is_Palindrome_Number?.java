import java.util.*;
class palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a,b,c=0;
        b=n;
        while(n!=0)
        {
            a=n%10;
            c=c*10+a;
            n=n/10;
        }
        if(c==b)
            System.out.println(2);
        else
            System.out.println(1);
    }
}