/* Reverse  agiven string keep first/second word as it is.
 Print Maximum/minimum number in an array. */
 import java.io.*;
 import java.util.Scanner;
 public class MinMax
 {
     public static void main (String[] args)
     {
         Scanner sc= new Scanner(System.in);
         System.out.println("Enter the size of the string:");
         int s=sc.nextInt();
         int[] arr=new int[s];
         System.out.println("Elements are:");
         for(int i=0;i<s;i++)
         {
             arr[i]=sc.nextInt();
         }
         for(int i=0;i<arr.length;i++)
         {
             for(int j=i+1;j<arr.length;j++)
             {
                 int temp=0;
                 if(arr[i]>arr[j])
                 {
                     temp=arr[i];
                     arr[i]=arr[j];
                     arr[j]=temp;
                 }
             }
             System.out.println("Reverse\n:"+arr[i]);
         }
         System.out.println("Min is:"+arr[0]);
         System.out.println("Max is:"+arr[arr.length-1]);
         sc.close();

     } 
 }