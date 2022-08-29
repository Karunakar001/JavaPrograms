package Karna;


import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

class Token
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        String input=scan.nextLine();
        tokenize(input,str);
        scan.close();
    }
    public static void tokenize(String input,String str)
    {
        String s[]={""};
        
        String[] output=Pattern.compile(str).split(input);//=input.trim().split("[!?._@'{,},{\s\t}+]+");
        
        if(Arrays.equals(output,s))
        {
            System.out.println("0");
            System.exit(0);
        }
        System.out.println(output.length);
        for(String a: output)
        {
            System.out.print(a+" ");
        }
    }
}