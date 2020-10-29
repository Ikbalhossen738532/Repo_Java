package MidTerm;

public class sony_3 {
    public static void main(String[] args) {

        speedPoint(1200);

    }

    public static void speedPoint(int dSpeed) {
        if (dSpeed <= 70) {
            System.out.println("Thank you for driving within the speed limit. ");
        }
        System.out.println("");
        int point = 0;
        for (int i = 74; i < dSpeed; i += 4) {
            point++;
        }
        System.out.println("You are loosing " + point + " points from your license");
        if (point >= 12) {
            System.out.println("license is suspended");
        }

    }
}