import java.util.*;
class unique
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        ArrayList<Integer>d=new ArrayList<>();
        while(a!=0)
        {
            int b=a%10;
            d.add(b);
            a=a/10;
        }
        HashSet<Integer>h=new HashSet<>(d);
        if(d.size()==h.size())
        {
            System.out.println("Unique Number");
        }
        else
        {
            System.out.println("Not Unique Number");
        }
    }
}