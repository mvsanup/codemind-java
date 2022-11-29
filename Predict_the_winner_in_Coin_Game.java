import java.util.*;
class coin
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int t=sc.nextInt();
        if(s%2==0 || t%2==0)
        {
            System.out.print("Player 1");
        }
        else
        {
            System.out.print("Player 2");
        }
    }
}