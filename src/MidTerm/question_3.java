package MidTerm;

public class question_3 {
    /**
     * Question 3:
     * Scenario: Traffic ticketing system
     * Write a method, that will print (not return) the points charged against
     * the license for over speeding.
     *
     *    1. Speed Limit = 70
     *    2. Every 5 miles over the speed limit will add 1 point
     *    3. If user gets 12 points for a speed then license is suspended
     *
     *  Example:
     *      user speed = 74 ; 0 points
     *      user speed = 78 ; 1 points  // 70-75(1) 75-78(0) = 1
     *      user speed = 88 ; 3 points  // 70-75(1) 75-80(1) 80-85(1) 85-88(0) = 3
     *      user speed = 178 ; 21 points (License suspended).
     *      user speed = 70 ; Thank you for driving within the speed limit.
     *
     */
   static  int point;

    public static void main(String[] args) {
      SpeedLimit(89);



    }
    public static void SpeedLimit(int speed){


        int point =0;
        for(int i =0;i<=speed;i++){
            if(speed<=74){
                point = 0;
                System.out.println("no point");
                break;
            }else if(speed>=75 && speed<=79){
                point=1;
                System.out.println("your point is: " + point);
                break;
            }else if(speed>=80 && speed<=84){
                point=2;
                System.out.println("your point is: " + point);
                break;
            }else if(speed>=85 && speed <=89){
                point=3;
                System.out.println("your point is: " + point);
                break;
            }else if(speed>=90 && speed <=94){
                point=4;
                System.out.println("your point is: " + point);
                break;
            }
            else if(speed>=95 && speed<=99){
                point=5;
                System.out.println("your point is: " + point);
                break;
            }else if(speed>=100 && speed<=104){
                point=6;
                System.out.println("your point is: " + point);
                break;
            }else if(speed>=105 && speed<=109){
                point=7;
                System.out.println("your point is: " + point);
                break;
            }else if(speed>=110 && speed<=114){
                point=8;
                System.out.println("your point is: " + point);
                break;
            }else if(speed>=115 && speed<=119){
                point=9;
                System.out.println("your point is: " + point);
                break;
            }else if(speed>=120 && speed<=124) {
                point = 10;
                System.out.println("your point is: " + point);
                break;
            }else if(speed>=125 && speed<=129){
                point=11;
                System.out.println("your point is: " + point);
                break;
            }else if(speed>=130 && speed<=134){
                point=12;
                System.out.println("your point is: " + point);
                break;
            }else{

                System.out.println("you have crossed the highest point limit");
            System.out.println("your license is suspended");


            }
        }


    }
}
