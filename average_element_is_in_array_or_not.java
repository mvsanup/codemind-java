import java.util.Scanner;
class sample 
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
        int c=0;
        for(int i=0;i<n;i++)
        {
            c+=m[i];
        }
        double d=c/n;
        int f=0;
        for(int i=0;i<n;i++)
        {
            if(m[i]==(int)d)
            {
                System.out.println("True");
                f=1;
                break;
            }
        }
        if(f==0)
        {
            System.out.println("False");
        }
    }
}