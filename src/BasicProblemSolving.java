import java.util.Random;

public class BasicProblemSolving {
    public static void main (String [] args){

        System.out.println("Welcome to Main Method.");

        Random rndm = new Random();
        int[] ary = new int [10];
        System.out.println("Preparing an array...");
        for (int i =0; i < ary.length; i++){
            ary[i] = Math.abs(rndm.nextInt(10));
            System.out.println("Array Element at ["+i+"]:"+ary[i]);
        }

        System.out.println();
        System.out.println("Calling Method getSumOfIntArray...");
        System.out.println("Output from Method getSumOfIntArray: "+getSumOfIntArray(ary));

        System.out.println();
        System.out.println("Calling Method getLargestElementOfIntArray...");
        System.out.println("Output from Method getLargestElementOfIntArray: "+getLargestElementOfIntArray(ary));

        System.out.println();
        int randomInt = Math.abs(rndm.nextInt(10));
        System.out.println("Calling Method checkOddEvenAndSearchIntArray with integer: "+ randomInt);
        System.out.println("Output from Method checkOddEvenAndSearchIntArray: ");
        checkOddEvenAndSearchIntArray(randomInt, ary);

        printIntArray(ary);
        System.out.println(ary);
        System.out.println("Calling Method reverseIntArray...");
        ary = reverseIntArray(ary);
        printIntArray(ary);
        System.out.println();

        System.out.println("Calling Method getFactorial with integer:"+randomInt);
        System.out.println("Output from Method getFactorial:"+getFactorial(randomInt));

        String s = "atoyyota";
        char[] chararray = new char[s.length()];
        for (int i = 0; i<chararray.length; i++){
            chararray[i]=s.charAt(i);
        }

        System.out.println("Output from Method checkPalindrome with word "+s+" :"+checkPalindrome(chararray));
        System.out.println("Output from Method checkPrime with integer "+randomInt+" :"+checkPrime(randomInt));
    }

    public static int getSumOfIntArray(int[] array){
        int sum = 0;
        for (int i=0; i<array.length; i++){
            sum = sum + array[i];
        }
        return sum;
    }

    public static int getLargestElementOfIntArray(int[] array){
        int max = 0;
        for (int i=0; i<array.length; i++){
            if (max < array[i]){
                max = array[i];
            }
        }
        return max;
    }

    public static void checkOddEvenAndSearchIntArray(int x, int[] array){

        if (x%2 == 0){
            System.out.println(x+" is an even number.");
        }
        else {
            System.out.println(x+" is an odd number.");
        }

        int count =0;
        for (int i=0; i<array.length; i++){
            if ( x == array[i]){
                count++;
            }
        }
        System.out.println(x+" appears in the array for "+count+" many times.");
    }

    public static int[] reverseIntArray(int[] array){

        int j = array.length;
        int[] newarray = new int[j];
        j--;

        for (int i=0; i < array.length; i++){
            newarray[j-i] = array[i];
        }
        return newarray;
    }

    public static void printIntArray(int[] array){
        System.out.println("Printing Array...");
        for (int i=0; i < array.length; i++){
            System.out.print(array[i]);
            System.out.print(" ");
        }
    }

    public static int getFactorial(int n){
        if (n == 0){
            return 1;
        }
        else return n*getFactorial(n-1);
    }

    public static boolean checkPalindrome(char[] chararray){
        int j = chararray.length-1;
        int check = 0;

        for (int i = 0; i < chararray.length; i++){
            if (chararray[i] != chararray[j-i]){
                check++;
            }
        }

        if (check>0){
            return false;
        }
        else{
            return true;
        }
    }

    public static boolean checkPrime(int n) {

        if (n == 0 || n == 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }



}