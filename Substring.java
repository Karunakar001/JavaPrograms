import java.util.Arrays;
import java.util.Scanner;
class Substring
{
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String string=sc.nextLine();
        int k,m,v;
        k=sc.nextInt();
        char[] proChar=new char[30];
        char[] tempChar=new char[30];
        String temp;
        


        proChar=string.toCharArray();


        System.out.println();
        m=proChar.length-k;
        String[] resultChar=new String[m+1];




        for(int i=0;i<proChar.length;i++)
        {
            if(i==m+1)
            {
                break;
            }
            for(int j=0;j<k;j++)
            {
                tempChar[j]=proChar[i+j];
            }
            temp=new String(tempChar);
            if(i<=m)
            {
                resultChar[i]=temp;
            }
             
        }



        for(v=0;v<resultChar.length;v++)
        {
            
             System.out.print(resultChar[v]+" ");
        }
       System.out.println("\n\n\n\n\n\n");

        
        for(int i = 0;i<resultChar.length;i++)
        {
            for(int j=i+1;j<resultChar.length;j++)
            {
                if(resultChar[i].compareTo(resultChar[j])>0)
                {
                    temp=resultChar[i];
                    resultChar[i]=resultChar[j];
                    resultChar[j]=temp;
                }
            }
        }
        for(v=0;v<resultChar.length;v++)
        {
             System.out.print(resultChar[v]+" ");
        }
        System.out.println("\n\n\n");
         System.out.println(resultChar[0]+"\n"+resultChar[v-1]);
sc.close();
            


    }
}