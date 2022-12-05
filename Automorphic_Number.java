import java.util.*;
class automorphic
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int n=((int)Math.log10(a))+1;
        if(a==((a*a)%(int)Math.pow(10,n)))
            System.out.println("Automorphic Number");
        else
            System.out.println("Not an Automorphic Number");
    }
}