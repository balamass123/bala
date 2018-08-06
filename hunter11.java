import java.util.*;
class hunter11
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s2[]=s.split(" ");
        String s1="";
        for(int i=0;i<s2.length;i++)
        {
            StringBuffer sb=new StringBuffer(s2[i]);
            s1=String.valueOf(sb.reverse());
            System.out.print(s1+" ");
        }
            
    }
}

