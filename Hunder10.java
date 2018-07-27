import java.util.*;
class Hunder10
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[m];
        int c=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            b[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(b[i]==a[j])
                {
                    c++;
                }
            }
        }
        if(c==b.length)
        {
           System.out.print("YES");
        }
        else
        {
           System.out.print("NO");
        }
    }
}
