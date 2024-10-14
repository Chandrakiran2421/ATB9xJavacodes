package OCT.exe10102024;

public class Lab05 {
    public  static void main (String [] args){
        int a=10,b=20;
        //1.Arithmetic Operators
        System.out.println(a+b);
        System.out.println(b-a);
        System.out.println(a*b);
        System.out.println(b/a);
        System.out.println(b%a);
        System.out.println(a++);
        System.out.println(--b);
        //2. Assignment Operators
        int c=10;
        System.out.println(c);
        System.out.println(c+=10);
        System.out.println(c-=5);
        System.out.println(c*=5);
        System.out.println(c/=5);
        System.out.println(c%=5);
        //3. Comparison Operators
        boolean isEqual = (a == b);
        System.out.println(isEqual);
        boolean isNotEqual = (a != b);
        System.out.println(isNotEqual);
        boolean isGreater = (a > b);
        System.out.println(isGreater);
        boolean isLess = (a < b);
        System.out.println(isLess);
        boolean isGreaterOrEqual = (a >= b);
        System.out.println(isGreaterOrEqual);
        boolean isLessOrEqual = (a <= b);
        System.out.println(isLessOrEqual);
        //4.Logical Operators
        boolean n=true,m=false;
        System.out.println(n&&m);
        System.out.println(n||m);
        System.out.println(!n);
        //5.Bitwise Operators
        int p=6,q=5;
        System.out.println(p&q);
        System.out.println(p|q);
        System.out.println(p^q);
        System.out.println(~q);
        System.out.println(q<<1);
        System.out.println(p>>1);
        //6.Ternary Operator
        int max = (a > b) ? a : b;

        System.out.println(max);
        //7.Instanceof Operator
        String str = "Chandra";
        boolean isString = str instanceof String;  // true
        System.out.println(isString);







    }
}
