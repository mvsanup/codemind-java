import java.util.*;
class sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int e=sc.nextInt();
        int f,c=0,g=1;
        while(e!=0)
        {
            f=e%10;
            c+=f;
            g*=f;
            e=e/10;
        }
        System.out.println(g-c);
    }
}