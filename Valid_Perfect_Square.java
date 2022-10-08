
import java.util.*;
class sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for (int i=0;i<a;i++)
        {
            int n=sc.nextInt();
            double d=Math.sqrt(n);
            if ((int)d==d)
                System.out.println("True");
            else
                System.out.println("False");
        }
    }
}
