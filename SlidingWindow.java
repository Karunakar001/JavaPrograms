package Karna;

import java.util.Scanner;

class SlidingWindow
{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int k=scan.nextInt();
        int[] a=new int[15];
        for(int i=0;i<a.length;i++)
        {
            a[i]=scan.nextInt();
        }
        int maxSum=0,temp=0,temp1=0;
        for(int i=0;i<a.length-k;i++)
        {
            for(int j=0;j<k;j++)
            {
                temp +=a[i+j];
            }
            
            if(maxSum<temp)
            {
                maxSum=temp; 
                temp1=i;   
            }
            temp=0;
        }
        for(int j=0;j<k;j++)
        {
            System.out.print(a[temp1]+" ");
            temp1++;
        }
        System.out.println();
        System.out.println(maxSum);
    }
}