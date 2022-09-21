import java.util.*;
class compundinterest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double p=sc.nextFloat();
        double r=sc.nextFloat();
        double t=sc.nextFloat();
        double a;
        a=(double)p*(Math.pow((1+r/100),t));
        System.out.format("%.2f",a);
    }
}