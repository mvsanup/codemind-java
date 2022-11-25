import java.util.*;
class odd
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int r,e=0,o=0,c=0;
        while(a!=0)
        {
            r=a%10;
            if(r%2==0)
            {
                e+=1;
            }
            else
            {
                o+=1;
            }
            a=a/10;
            c+=1;
        }
        if(e==c)
            System.out.print("Even");
        else if(o==c)
            System.out.print("Odd");
        else
            System.out.print("Mixed");
    }
}