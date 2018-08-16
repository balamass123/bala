import java.util.*;
class Player81
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1[]=s.split(" ");
        String s2="",s3="";
        for(int i=0;i<s1.length;i++)
        {
            s3=s1[i].substring(1).toLowerCase();
            s2=String.valueOf(s1[i].substring(0,1)).toUpperCase(); 
            System.out.print(s2+s3+" ");
        }
    }
}

