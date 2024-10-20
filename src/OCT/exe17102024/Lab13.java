package OCT.exe17102024;

import java.util.Scanner;
public class Lab13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the side 1");
        int s1=sc.nextInt();
        System.out.println("Enter the length of the side 2");
        int s2=sc.nextInt();
        System.out.println("Enter the length of the side 3");
        int s3=sc.nextInt();
        if(s1 == s2 && s1 == s3){
            System.out.println("It's an Equilateral Triangle");
        }
        else if(s1 != s2 && s2!=s3 && s1!=s3){
            System.out.println("It's an Scalene Triangle");
        }
        else {
            System.out.println("It's an Isosceles Triangle");
        }

    }
}

