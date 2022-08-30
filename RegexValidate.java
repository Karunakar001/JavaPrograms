import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegexValidate{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        
        int testcase = Integer.parseInt(scan.nextLine());
        String regex;
        for(int i=0;i<testcase;i++)
        {
            regex=scan.nextLine();
            regexValidation(regex);
        }
        scan.close();
    }
    public static void regexValidation(String regex){
       // PatternSyntaxException p=new PatternSyntaxException("Invalid", regex, 0);
        try{
            Pattern b=Pattern.compile(regex);
            System.out.println("Valid");
        }
        catch(PatternSyntaxException patternSyntaxException)
        {
            System.out.println("Invalid");
        }
    }
}
