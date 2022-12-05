import java.util.*;
class count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int u=sc.nextInt();
        int t=sc.nextInt();
        int f,g;
        for(int i=0;i<t;i++)
        {
            f=sc.nextInt();
            g=sc.nextInt();
            if(f<u || g<u)
            {
                System.out.println("UPLOAD ANOTHER");
            }
            else
            {
                if(f==g)
                {
                    System.out.println("ACCEPTED");
                }
                else
                {
                    System.out.println("CROP IT");
                }
            }
        }
    }
}