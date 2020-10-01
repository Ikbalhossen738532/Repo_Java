package HomeWorks;

public class If_Else_HW {
    public static void main(String[] args) {

        /**
         * Create variable to store student-score and total-possible-score;
         *Based on the percentage, display grade to student:
         *Grade A: 91-100
         *Grade B: 81-90
         *Grade C: 71-80
         *Grade D: 61-70
         *Grade E: 51-60
         *Grade F: less than or equa
         */

        double studentScore = 40;
        double maxScore = 100;
        double percentage = (studentScore/maxScore)*100;

        if(percentage>90){
            System.out.println("your percentage is : " + percentage + " and your grade is : A");
        } else if (percentage>80 && percentage<=70){
            System.out.println("your percentage is : " + percentage + " and your grade is : B");
        }else if(percentage>70 && percentage<=60){
            System.out.println("your percentage is : " + percentage + " and your grade is : C");
        }else if (percentage>60 && percentage<=51){
            System.out.println("your percentage is : " + percentage + " and your grade is : D");
        }else
            System.out.println("your percentage is : " + percentage + " and your grade is : F");


        /**
         * store value in an int variable
         * if number is divisible by 3, print "divisible by 3"
         *if number is divisible by 5, print "divisible by 5"
         *if number is divisible by 3 and 5, print "divisible by both"
         *if not divisible by 3 or 5, print the number
         *
         */

        int number = 30;

        if(number%3==0){
            System.out.println("divisible by 3 ");
        }else if(number%5==0){
            System.out.println("divisible by 5");
        }if(number%3==0 && number%5==0){
            System.out.println("divisible by 3 and 5");
        }else
            System.out.println("undivisible number is :" + number);


        /**
         * Checking car mode (P, D, N, R)   // switch
         * if car mode is P and "you can park car"
         * if car mode is D drive car
         * if drive type is Snow, display "You are on Snow mode"
         * if drive type is Sport, display "You are on Sport mode"
         * if drive type is Eco, display "You are on Eco mode"
         * if car mode is N you can "put car in car wash"
         * if car mode is R you can "revere the car"
         */


        char gear = 'D';
        String carMode = "Snow";

        switch (gear){
            case 'P':
                System.out.println("you can park your car");
                break;
            case 'N':
                System.out.println("put car in car wash");
                break;
            case 'R':
                System.out.println("reverse the car");
                break;
            case 'D':
                if(carMode=="Snow"){
                    System.out.println("you are on snow mood");
                }else if(carMode=="Sport"){
                    System.out.println("you are on sport mode");
                }else if(carMode=="Eco"){
                    System.out.println("you are on eco mode");
                }
                break;

        }




    }
}
