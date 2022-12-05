import java.util.*;
class ugly
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int f=sc.nextInt();
        int c=0;
        while(f!=1)
        {
            if(f%5==0)
            {
                f=f/5;
            }
            else if(f%3==0)
            {
                f=f/3;
            }
            else if(f%2==0)
            {
                f=f/2;
            }
            else
            {
                System.out.println("Not Ugly Number");
                c+=1;
                break;
            }
        }
        if(c==0)
        {
            System.out.println("Ugly Number");
        }
    }
}