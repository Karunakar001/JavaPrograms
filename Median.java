package Karna;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Median
{
    public static void main(String[] args) {
        int j;
        ArrayList<Integer> al1=new ArrayList<>();
        ArrayList<Integer> al2=new ArrayList<>();
        int mid=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size");
        int n=scan.nextInt();
        for(int i=0;i<n;i++)
        {
            j=scan.nextInt();
            al1.add(j);
            Collections.sort(al1);
            mid=al1.size()/2;
            if(al1.size()==1)
            {
                al2.add(al1.get(0));
            }
            else if(al1.size()%2==0)
            {
                int median=(al1.get(mid)+al1.get(mid-1))/2;
                al2.add(median);
            }
            else
            {
                int median=(al1.get(mid));
                al2.add(median);
            }
        }
        System.out.println(al2);
       // System.out.println(al.size());
       scan.close();
    }
}