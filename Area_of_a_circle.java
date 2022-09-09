import java.util.Scanner;
class area
{
    public static void main(String args[])
    {
        int r;
        double p=3.14,area;
        Scanner sc=new Scanner(System.in);
        r=sc.nextInt();
        area=p*r*r;
        System.out.format("%.2f",area);
        sc.close();
    }
}