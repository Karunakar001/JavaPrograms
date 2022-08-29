package Karna;


import java.util.Arrays;
import java.util.Scanner;

class Token
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String input=scan.nextLine();
        tokenize(input);
        scan.close();
    }
    public static void tokenize(String input)
    {
        String s[]={""};
        String[] output=input.trim().split("[!?._@'{,},{\s\t}+]+");
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