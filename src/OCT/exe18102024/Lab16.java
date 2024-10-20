package OCT.exe18102024;

import java.util.Scanner;
public class Lab16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        int choice =sc.nextInt();
        switch (choice){
            case 1:
                System.out.print("Enter the units in Km: ");
                double km=sc.nextDouble();
                double miles=km*0.621371;
                System.out.println("The "+km+ " km is equal to " + miles+" miles");
                break;
            case 2:
                System.out.println("Enter temperature in Fahrenheit: ");
                double Fahrenheit=sc.nextDouble();
                double celsius = (Fahrenheit - 32) * 5/9;
                System.out.println("The "+Fahrenheit+ " Fahrenheit is equal to " + celsius+ " celsius");
                break;
            default :
                System.out.println("You have choose the wrong choice");
        }

    }
}


