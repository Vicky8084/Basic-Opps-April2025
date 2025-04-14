package exceptionhandlingexample;

public class ArrayOutOfBondExceptionExample {
    public static void main(String[] args) {
        int []arr={2,3,4,5,6,7};
        try{
            System.out.println("1tn Index :- "+arr[1]);
            System.out.println("4th Index :- "+arr[4]);
            System.out.println("9th Index :- "+arr[9]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception Occurred :- "+e.getMessage());
        }
    }
}
