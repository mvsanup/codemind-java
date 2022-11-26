import java.util.*;
class divisor
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int g=sc.nextInt();
        int h=sc.nextInt();
        int k=sc.nextInt();
        int c=0;
        for(int i=g;i<=h;i++)
        {
            if(i%k==0)
            {
                c+=1;
            }
        }
        System.out.print(c);
    }
}