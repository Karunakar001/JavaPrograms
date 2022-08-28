package Karna;
import java.util.Arrays;
import java.util.Scanner;

class ArraySortRamdom
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        int rNum=scan.nextInt();
        arraySortRandom(a,n,rNum);
        scan.close();
    }
    public static void arraySortRandom(int a[],int n,int rNum)
    {
        int i,temp;
        Arrays.sort(a);
        for(i=0;i<n;i++)
        {
            if(a[i]==rNum)
            {
                break;
            }
        }
        for(int j=n-1;j>=i;j--)
        {
            i++;
            temp=a[j];
            a[j]=a[i];
            a[i]=temp;
            
        }
        for(int j=0;j<n;j++)
        {
            System.out.print(a[j]+" ");
        }
    }
}