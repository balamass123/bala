import java.util.*;
class Player5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        String s="0,I,II,III,IV,V,VI,VII,VIII,IX,X,XI,XII,XIII,XIV,XV,XVI,XVII,XVIII,XIX,XX";
        String s1[]=s.split(",");
        for(int i=0;i<s1.length;i++)
        {
            if(n.equals(String.valueOf(s1[i])))
            {
                System.out.print(i);
            }
        }
        
    }
}
