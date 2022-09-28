import java.util.*;
class ele
{
    public static boolean pal(int n)
    {
        int temp=n,s=0,r;
        while(n!=0)
        {
            r=n%10;
            s=s*10+r;
            n=n/10;
        }
        if(s==temp)
        {
            return true;
        }
        return false;
    }
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int c=0;
		int n=sc.nextInt();
		int [] m=new int[n];
		for(int i=0;i<n;i++)
		{
		    m[i]=sc.nextInt();
		    if(pal(m[i])==true)
		    {
		        c++;
		    }
		}
		System.out.println(c);
		
	}
}