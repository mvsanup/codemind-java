import java.util.*;
class pat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        if(m>=3)
        {
            for(int i=1;i<=m;i++)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i=m-1;i>0;i--)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else
        {
            System.out.println("The pattern is not possible");
        }
    }
}