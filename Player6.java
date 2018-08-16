import java.util.*;
class Player6
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String s1=sc.next();
        ArrayList<String> ar=new ArrayList<String>();
        ArrayList<String> ar1=new ArrayList<String>();
        for(int i=0;i<s.length();i++)
        {
            ar.add(String.valueOf(s.charAt(i)));
        }
        for(int i=0;i<s1.length();i++)
        {
            ar1.add(String.valueOf(s1.charAt(i)));
        }
        Set<String> tr=new LinkedHashSet<String>(ar);
        Set<String> tr1=new LinkedHashSet<String>(ar1);
        long m=0,n=0,c=0;
        for(String s2:tr)
        {
            m=Collections.frequency(ar,s2);
        }
        for(String s3:tr1)
        {
            n=Collections.frequency(ar1,s3);
        }
        if(m==n)
        {
            System.out.print("yes");
        }
        else
        {
            System.out.print("no");
        }
    }
}






