import java.util.*;
class perfect
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=0;
        for(int i=1;i<Math.sqrt(a)+1;i++)
        {
            if(i*i==a)
            {
                b=1;
                break;
            }
        }
        if(b==1)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}