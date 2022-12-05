import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int s=sc.nextInt();
        int t[]=new int[r];
        int u[]=new int[s];
        for(int i=0;i<r;i++)
            t[i]=sc.nextInt();
        for(int i=0;i<s;i++)
            u[i]=sc.nextInt();
        HashSet<Integer>a=new HashSet<Integer>();
        for(int ele:t)
        {
            a.add(ele);
        }
        HashSet<Integer>b=new HashSet<Integer>();
        for(int ele:u)
        {
            b.add(ele);
        }
        int c=0;
        for(int ele:a)
        {
            if(b.contains(ele)==true)
            {
                c+=1;
            }
        }
        for(int ele:b)
        {
            if(a.contains(ele)==true)
            {
                c+=1;
            }
        }
        System.out.print(c/2);
    }
}