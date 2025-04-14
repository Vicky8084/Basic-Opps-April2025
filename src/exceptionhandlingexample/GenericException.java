package exceptionhandlingexample;

public class GenericException {
    public static void main(String[] args) {
        int a=10,b=4,rslt=0;
        int []arr={1,2,3,4,5,6};
        String str1="Vciky Gupta";
        String str2=null;
        try{
            rslt=a/b;
            System.out.println("value of a is :- "+a);
            System.out.println("value of b is :- "+b);
            System.out.println("value of rslt is :- "+rslt);

            System.out.println("1st Index :- "+arr[1]);
            System.out.println("2nd Index :- "+arr[2]);
            System.out.println("7th Index :- "+arr[7]);
            System.out.println("9th Index :- "+arr[9]);


            System.out.println("Length of str1 :-  "+str1.length());
            System.out.println("Length of str2 :-  "+str2.length());
        }

        catch(Exception e){
            System.out.println("Exception Occurred :- "+e.getMessage());
        }
    }
}
