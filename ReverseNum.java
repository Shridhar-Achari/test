//Reverse given number
import java.io.*;
import java.util.Scanner;
public class ReverseNum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        System.out.println("Original is:"+num);
        int rev=0;
        int rem=0;
        while(num!=0)
        {
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println("Reverse is:"+rev);
        sc.close();
    }
}