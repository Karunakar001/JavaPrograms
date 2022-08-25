import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

class FrequencySort
{
    public static void main(String[] args) {                
        
        int[] a={2,2,4,6,5,2,6,6,1,6};                //HardCoded!!

        // Scanner scan=new Scanner(System.in);                    
        // int size=scan.nextInt();                        //Array Input Through User!!
        // int[] a=new int[size];
        // for(int i=0;i<size;i++)
        // {
        //     a[i]=scan.nextInt();
        // }



        int temp,count=0,key,tvalue=0,l=0,svalue,j1=0;

        HashMap<Integer,Integer> set=new HashMap<>();
        ArrayList<Integer> al=new ArrayList<>();



        for(int i=0;i<a.length;i++)
        {   
            temp=a[i];

            if(set.containsKey(a[i]))
            {
                continue;
            }

            for(int j=i;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    count++;
                }
            }

            set.put(a[i],count);
            count=0;
        }
        //System.out.println(set);

        for (int i : set.keySet()) {
            for (int j : set.keySet()) {
                if(tvalue<=set.get(j))
                {
                    tvalue=set.get(j);
                }
            }
        }




        //System.out.println(tvalue);



        for (int i : set.keySet()) {
            for (int j : set.keySet()) {
                if(tvalue==set.get(j))
                {
                    for(i=0;i<tvalue;i++)
                    {
                        al.add(j);
                    }
                }
               
            }
            tvalue--;
        }


        System.out.println(al);

    }   
}