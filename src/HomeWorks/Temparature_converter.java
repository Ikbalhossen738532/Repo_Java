package HomeWokrs;

public class Temparature_converter {
    public static void main(String[] args) {


        //Fahrenheit to Celsious     T(°C) = (T(°F) - 32) × 5/9
        double fTemp = 70;
        double cTemp = (fTemp - 32) * 5/9;
        System.out.println( fTemp + "F is equal to " + cTemp + "deg celsious");


        // fahrenheit to kelvin     T(K) = (T(°F) + 459.67)× 5/9
        double fTemp1 = 60;
        double kTemp = (fTemp1 + 459.67) * 5/9;
        System.out.println( fTemp1 + "F is equal to " + kTemp + " kelvin ");

        // kelvin to celsious  T(°C) = T(K) - 273.15
        double kTemp1 = 20;
        double cTemp1 = ( kTemp1 - 273.15 );
        System.out.println( kTemp1 + "k is equal to " + cTemp1 + " deg celsious");

        //kelvin to Fahrenheit  T(°F) = T(K) × 9/5 - 459.67
        double kTemp2 = 30;
        double fTemp2 = kTemp2 * 9/5 - 459.67 ;
        System.out.println( kTemp2 + "k is equal to " + fTemp2 + "fahrenheit") ;

        // celsious to kelvin  T(K) = T(°C) + 273.15
        double cTemp3 = 50;
        double fTemp3 = cTemp3 + 273.15;
        System.out.println( cTemp3 + "C is equal to " + cTemp3 + "kelvin");


    }
}
