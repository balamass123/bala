import java.util.*;
class player3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        StringBuffer sb=new StringBuffer(a);
        sb.reverse();
        System.out.print(sb);
    }
}
