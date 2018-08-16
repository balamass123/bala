import java.util.*;
class Player7
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char c[]=s.toCharArray();
        for(int i=0;i<c.length-1;)
        {
             char temp=c[i];
            c[i]=c[i+1];
            c[i+1]=temp;
            i=i+2;
        }
        System.out.print(c);
    }
}
