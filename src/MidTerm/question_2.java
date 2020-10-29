package MidTerm;

public class question_2 {
    /**
     *  Create a method to return missing smallest positive integer (greater than 0)
     *  from given array.
     *
     *  exm:
     *  For array : {1, 3, 5, 4, 2, 7}
     *      * 	Method should return : 6
     *      *
     *      * 	For array : {-1, -3, 4, 2}
     *      * 	Method should return : 1
     */
    public static void main(String[] args) {
        int [] Arr= {-1,-2,2,3,0,5,6,7,1};
        System.out.println(findMissingNum(Arr));
    }



    public static int findMissingNum(int[]arr){
        int missingnum = 1;
        for(int i=0;i <arr.length;i++){
            if(arr[i]==missingnum){
                missingnum++;
                i=-1;
            }
        }
    return missingnum;
    }




}
