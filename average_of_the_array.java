import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int m[]=new int[a];
        int sum=0;
        for(int i=0;i<a;i++)
        {
            m[i]=sc.nextInt();
            sum+=m[i];

        }
        float avg=(float)sum/a;
        System.out.format("%.2f",avg);
    }
    
}