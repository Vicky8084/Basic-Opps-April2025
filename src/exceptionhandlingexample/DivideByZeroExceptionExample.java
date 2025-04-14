package exceptionhandlingexample;

public class DivideByZeroExceptionExample {
    public static void main(String[] args) {
        int a=10,b=0,rslt=0;
        try{
            rslt=a/b;
        }
        catch (ArithmeticException e){
            System.out.println("Exception Occurred :- "+e.getMessage());
        }

        System.out.println("value of a is :- "+a);
        System.out.println("value of b is :- "+b);
        System.out.println("value of rslt is :- "+rslt);
    }
}
