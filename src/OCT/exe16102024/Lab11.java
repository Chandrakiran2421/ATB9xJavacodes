package OCT.exe16102024;

import java.util.Scanner;

public class Lab11 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int num1=sc.nextInt();
        System.out.println("Enter the 2nd number");
        int num2=sc.nextInt();
        int maxnum=(num1>num2)? num1:num2;
        System.out.println(maxnum);
    }
}

