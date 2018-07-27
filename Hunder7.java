import java.util.*;
class Hunder7
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int c=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                if(i%2!=0)
                {
                    System.out.print(a[i]+" ");
                }
            }
            else if(a[i]%2!=0)
            {
                if(i%2==0)
                {
                    System.out.print(a[i]+" ");
                }
            }
        }
    }
}
