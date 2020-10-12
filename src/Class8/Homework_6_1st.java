package Class8;
public class Homework_8_1st {

    /**
     * Create a method to find average of an int-array
     *
     */
    public static void arrayAvg(int[] arr) {
        // write code to find average
        // Decide on the return type
        // 22, 11, 33, 44, 55
        // add all / total number


    }


    public static void main(String[] args) {

        int avarage =number(10,20,10,40,50);
        System.out.println( "avarage of the given value is : " + avarage);

    }

    public static int number(int ...arr) { //this 3 dots also an array
        int sum=0;
        int length =arr.length;

        for(int i =0;i<arr.length;i++){
            sum+=arr[i];

        }
        int agerage = sum/length;
        return agerage;
    }

       }








