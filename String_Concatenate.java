
import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		String c=a.concat(b);
		String s="";
		char d[]=c.toCharArray();
		Arrays.sort(d);
		for(int i=0;i<d.length;i++)
		    s+=d[i];
		System.out.println(s);
    }   
    
}
