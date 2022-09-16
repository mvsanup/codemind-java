import java.util.*;
class series
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        float a=0;
        for(float i=1;i<n+1;i++)
        {
            a=a+(1/i);
        }
        System.out.format("%.2f",a);
    }
}