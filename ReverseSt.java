import java.io.*;
import java.util.Scanner;
public class ReverseSt
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String num=sc.nextLine();
        String rev="";
        System.out.println("Original is:"+num);
        for(int i=num.length()-1;i>=0;i--)
        {
            rev=rev+num.charAt(i);
        }
        System.out.println("Reverse is:"+rev);
        sc.close();
    }
}