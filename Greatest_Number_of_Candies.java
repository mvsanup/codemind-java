import java.util.*;
class gnc
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int f=sc.nextInt();
        int arr[]=new int[f];
        for(int i=0;i<f;i++)
        {
            arr[i]=sc.nextInt();
        }
        int r=sc.nextInt();
        int n=arr[0];
        for(int k:arr)
        {
            if(n<k)
            {
                n=k;
            }
        }
        for(int k:arr)
        {
            if((r+k)>=n)
            {
                System.out.print("True ");
            }
            else
            {
                System.out.print("False ");
            }
        }
    }
}