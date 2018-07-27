import java.util.*;
class Fact
{
    public static void main(String args[])
    {
        int n=0,fact=1;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            fact=i*fact;
        }
        System.out.println(""+fact);
    }
}

