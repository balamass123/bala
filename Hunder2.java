import java.util.*;
class Hunder2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int c=1;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        for(int i=0;i<n-1;i++)
        {
            if(a[i]==a[i+1])
            {
                c++;
            }
        }
        if(c==n)
        {
            System.out.print(a[0]);
        }
        else
        {
            for(int i=a.length-1;i>=0;i--)
            {
                System.out.print(a[i]);
            }
        }
        
    }
}

