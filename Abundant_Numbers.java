import java.util.*;
class an
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int e=sc.nextInt();
        int f=0;
        for(int i=1;i<e;i++)
        {
            if(e%i==0)
            {
                f+=i;
            }
        }
        if(f>e)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}