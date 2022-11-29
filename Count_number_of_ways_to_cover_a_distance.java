import java.util.*;
class dist
{
    public static int rec(int n)
    {
        if(n<0)
            return 0;
        else if(n==0)
            return 1;
        return rec(n-1)+rec(n-2)+rec(n-3);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(rec(n));
    }
}