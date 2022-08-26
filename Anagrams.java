package Karna;
import java.util.*;

class Anagrams {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        HashMap<Character,Integer> hashm1=new HashMap<>();
        HashMap<Character,Integer> hashm2=new HashMap<>();

        Scanner scan=new Scanner(System.in);
        
        String s1=scan.next(); 
        String s2=scan.next();
        
        char[] sch1=new char[s1.length()];
        char[] sch2=new char[s2.length()];
        
        s1=s1.toUpperCase();
        s2=s2.toUpperCase();
        
        //System.out.println(s1+"\t"+s2);
        
        sch1=s1.toCharArray();
        sch2=s2.toCharArray();
        
        int count=0,flag=0;
        for(int i=0;i<sch1.length;i++)
        {   
            if(hashm1.containsKey(sch1[i]))
            {
                continue;
            }

            for(int j=i;j<sch1.length;j++)
            {
                if(sch1[i]==sch1[j])
                {
                    count++;
                }
            }

            hashm1.put(sch1[i],count);
            count=0;
        }

        for(int i=0;i<sch2.length;i++)
        {   
            if(hashm2.containsKey(sch2[i]))
            {
                continue;
            }

            for(int j=i;j<sch2.length;j++)
            {
                if(sch2[i]==sch2[j])
                {
                    count++;
                }
            }

            hashm2.put(sch2[i],count);
            count=0;
        }
      // System.out.println(hashm1+"\n"+hashm2);
    
      for (char c : sch2) {
            if(hashm1.get(c)==hashm2.get(c))
            {
                continue;
            }
            else
            {
                flag=1;
            }
        }
        System.out.println((flag==0)?"Anagrams":"Not Anagrams");

        scan.close();
    }
}