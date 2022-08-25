package Karna;

import java.util.ArrayList;
import java.util.Scanner;

public class IdentifyingDuplication {
    public static void identifyingDuplication(int[] a) {
        ArrayList<Integer> al=new ArrayList<>();
        ArrayList<Integer> al1=new ArrayList<>();
       for (int i = 0; i < a.length; i++) {
        if(!(al.contains(a[i])))
        {
            al.add(a[i]);
        }
        else
        {
            al1.add(a[i]);
        }
       } 
       System.out.println(al1);
    }





    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);                    
        int size=scan.nextInt();                        //Array Input Through User!!
        int[] a=new int[size];
        for(int i=0;i<size;i++)
        {
            a[i]=scan.nextInt();
        }
        identifyingDuplication(a);
    }
}
