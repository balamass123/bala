import java.util.*;
class Hunder8
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
            for(int j=i+1;j<a.length;j++)
            {
                for(int k=j+1;k<a.length;k++)
                {
                    c=a[i]+a[j];
                    if(c==a[k])
                    {
                        System.out.println(a[i]+" "+a[j]+" "+a[k]);
                        c=0;
                    }
                }
            }
        }
    }
}
        
