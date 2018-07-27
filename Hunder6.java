import java.util.*;
class Hunder6
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
        Arrays.sort(a);
        for(int i=0;i<n-1;i++)
        {
            if(a[i]==a[i+1])
            {
                System.out.print(a[i]);
                c=1;
                break;
            }
        }
        if(c==0)
        {
            System.out.print("unique");
        }
    }
}

