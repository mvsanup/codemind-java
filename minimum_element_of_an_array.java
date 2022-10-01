import java.util.Scanner;
class min
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] m=new int[n];
        for(int i=0;i<n;i++)
        {
            m[i]=sc.nextInt();
        }
        int c=10000;
        for(int i=0;i<n;i++)
        {
            if(m[i]<c)
            {
                c=m[i];
            }
        }
        System.out.println(c);
    }
}