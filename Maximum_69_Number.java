import java.util.*;
class sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d[]=new int[30];
        int i=0,r;
        while(n!=0)
        {
            r=n%10;
            n=n/10;
            d[i]=r;
            i++;
        }
        for(int j=i;j>=0;j--)
        {
            if(d[j]==6)
            {
                d[j]=9;
                break;
            }
        }
        for(int j=i-1;j>=0;j--)
        {
            System.out.print(d[j]);
        }
    }
}