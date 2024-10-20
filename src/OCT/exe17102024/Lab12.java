package OCT.exe17102024;

import java.util.Scanner;
public class Lab12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the grade");
        float Grade=sc.nextFloat();
        if(Grade<=100 && Grade>=90) {
            System.out.println("A");
        }
        if(Grade<=100 && Grade>=90) {
            System.out.println("A");
        }
        if(Grade<=89 && Grade>=80) {
            System.out.println("B");
        }
        if(Grade<=79 && Grade>=70) {
            System.out.println("C");
        }
        if(Grade<=69 && Grade>=60) {
            System.out.println("D");
        }
        if(Grade<=59 && Grade>=0) {
            System.out.println("F");
        }
    }

}

