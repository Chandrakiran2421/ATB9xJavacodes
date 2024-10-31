package OCT.exe23102024;
import java.util.Scanner;
public class Lab20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1");
        int n1 = sc.nextInt();
        System.out.println("Enter the numbe2");
        int n2 = sc.nextInt();

        int add = add_function(n1, n2);
        System.out.println(add);

    }

        static int add_function(int n1, int n2){
            return n1+n2;
        }
}
