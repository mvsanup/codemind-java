
import java.util.Scanner;
class area
{
    public static void main(String args[])
    {
        double a,b,c;
        double s,t,area;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        s=(a+b+c)/2;
        area=s*(s-a)*(s-b)*(s-c);
        t=Math.sqrt(area);
        System.out.format("%.2f",t);
        sc.close();
    }
}
