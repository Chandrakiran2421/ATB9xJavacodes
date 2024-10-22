package OCT.exe22102024;
import java.util.Scanner;
public class Lab17 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        long num=sc.nextLong();
        long reversenum=0;
        while(num!=0){
            long digit= num%10;
             reversenum=reversenum*10+digit;
            num /=10;
        }
        System.out.println(reversenum);
    }
}
