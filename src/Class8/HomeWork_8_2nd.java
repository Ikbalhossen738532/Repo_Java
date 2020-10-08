package Class8;

public class HomeWork_8_2nd {

    /**
     *
     * String[] names = {"john" , "michael" , "gphilipppre" , "philip" , "ilena" , "palena" , "fahry"}
     * String nameToSearch = "philip";
     * Create a method (NO return) that will print the index of given name in the given array
     *
     */

    public static void main(String[] args) {
        String[] value= {"john" , "michael" , "gphilipppre" , "philip" , "ilena" , "palena" , "fahry"};

        boolean contain = false;
        String searchname= "john";
        int index  = 0;

        for(int i=0;i<value.length;i++){
            if (value[i].equalsIgnoreCase(searchname)){
                contain = true;
                index=i;
                break;
            }

        }
        if(contain==true){
            System.out.println(searchname + "is contain in the array");
            System.out.println("index of " + searchname + " : is " + index);
        }else
            System.out.println("sorry name is not found");





    }


    public static void name (String ...givenname) {
        String[] value= {"john" , "michael" , "gphilipppre" , "philip" , "ilena" , "palena" , "fahry"};

        boolean contain = false;
        String searchname="";
        int index  = 0;

        for(int i=0;i<value.length;i++){
            if (value[i].equalsIgnoreCase(searchname)){
                contain = true;
                index=i;
                break;
            }

        }
        if(contain==true){
            System.out.println(searchname + "is contain in the array");
            System.out.println("index of " + searchname + " : is " + index);
        }else
            System.out.println("sorry name is not found");





    }
}
