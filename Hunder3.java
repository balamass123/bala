import java.util.*;
class Hunder3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int c=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(i==a[i])
            {
                b[i]=a[i];
                c++;
            }
        }
        if(c==0)
        {
            System.out.print(-1);
        }
        else
        {
            for(int i=0;i<b.length;i++)
            {
                if(b[i]!=0)
                System.out.print(b[i]+" ");
            }
        }
    }
}

