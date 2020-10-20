package class9;

import javax.jws.soap.SOAPBinding;

public class subMathod_HW7 {


// Homework 7

    /**
     *1. Create a method to add all the numbers in a array with double-values
     */
    public  double addNum(double[] arr){
        int sum =0;
        int length=arr.length;

        for(int i=0;i<length;i++){
            sum+=arr[i];
        }return sum;
    }




    /**
     * . Create a method to verify if the input-int-number is prime or not
     *prime number: number divisible by 1 and itself
     * eg: 7 -> prime
     *  21 -> not a prime
     */

    public boolean isprimeNumber(int  checkNumber){

        boolean isPrime = true;

        for(int i=2;i<checkNumber;i++){
            if(checkNumber%i==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println(checkNumber + " is a prime number");
        }else {
            System.out.println(checkNumber + " is not a prime number");

        }

        return isPrime;
    }
    /**
     *  Create a method to find if given string is palindrome.
     *  Palindrome: string which reads the same in reverse.
     *  racecar  ->  racecar
     *  level    ->  level
     *
     */

    public static void main(String[] args) {
        String original= "shawan";
        String reverse="";
        for(int i=original.length()-1;i>=0;i--){
            reverse +=original.charAt(i);
        }
        boolean isPalindrome = true;
        for(int i=0;i<original.length();i++){
            if(original.charAt(i) != reverse.charAt(i)){
                isPalindrome = false;
            }
        }if(isPalindrome){
            System.out.println("its palindrome");
        }else {
            System.out.println("its not palindrome");
        }
    }


    public String paralindrome (String original){
         //original= "";
        String reverse="";
        for(int i=original.length()-1;i>=0;i--){
            reverse +=original.charAt(i);
        }
        boolean isPalindrome = true;
        for(int i=0;i<original.length();i++){
            if(original.charAt(i) != reverse.charAt(i)){
                isPalindrome = false;
            }
        }if(isPalindrome){
            System.out.println( " its palindrome");
        }else {
            System.out.println( " its not palindrome");
        }return original;
    }


//    public String paralindrome(String myString){
//         //myString = "";
//        StringBuffer buffer = new StringBuffer(myString);
//        buffer.reverse();
//
//         String data = buffer.toString();
//        if(myString.equals(data)){
//            System.out.println("given string in paralindrome");
//        }else{
//            System.out.println("given string is not palindrome");
//        }
//        return myString;
//    }

    /**
     * Write a method to print(no return) the duplicate values in a given String array.
     *Input String array -> {"hello", "peace", "happy" , "hello", "Happy", "hello"}
     *Method should print -> hello, happy
     *hello
     *happy
     */

    public void findDublicate (String[] name){
        for(int i =0;i <name.length;i++){
            for(int j=i+1;j<name.length;j++){
                if(name[i].equals(name[j])){
                    System.out.println("duplicate value is " + name[i]);
                }
            }
        }
    }

    /**
     * 5. Write a method to print(no return) the common values between two arrays (string arrays)
     *Input arrays:
     *arr1 -> {"hello", "peace", "happy" , "hello", "Happy", "hello", "laugh"}
     *arr2 -> {"hello", "grow", "laugh" , "peace"}
     *Method should print -> hello, peace, laugh
     *hello
     *peace
     *laugh
     */


    public void findCommon(String[]arr1,String[]arr2){
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[i]){

                }System.out.println( arr1[i]);
                break;
            }
        }

    }

}
