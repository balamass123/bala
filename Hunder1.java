import java.util.*;
class Hunder1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        ArrayList<Integer> ar=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            ar.add(a[i]);
        }
        TreeSet<Integer> tr=new TreeSet<Integer>(ar);
        for(int b:tr)
        {
            if((Collections.frequency(ar,b))>1)
            {
                System.out.print(b+" ");
            }
        }
        
    }
}






