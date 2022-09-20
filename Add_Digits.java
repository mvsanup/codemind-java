import java.util.*;
class add
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,c;
        while(n!=0)
        {
            c=n%10;
            sum+=c;
            n=n/10;
            if(n==0 && sum>9)
            {
                n=sum;
                sum=0;
            }
        }
        System.out.println(sum);
    }
}