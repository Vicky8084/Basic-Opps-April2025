package exceptionhandlingexample;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String str1="Vicky Gupta";
        String str2=null;
        try{
            System.out.println("Length of Str1 :- "+ str1.length());
            System.out.println("Length of Str2 :- "+str2.length());
        } catch (Exception e) {
            System.out.println("Exception Occurred :- "+e.getMessage());
        }
    }
}
