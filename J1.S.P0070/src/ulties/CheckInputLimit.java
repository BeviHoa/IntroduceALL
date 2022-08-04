package ulties;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
//J1.S.P0070: Login system of the Tien Phong Bankâ€™s Ebank
public class CheckInputLimit {
// method checkInputIntLimit dÃ¹ng Ä‘á»ƒ check dá»¯ liá»‡u nháº­p vÃ o náº±m trong khoáº£ng min-max
    public static int checkInputIntLimit(int min, int max) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());//chuyá»ƒn kiá»ƒu string vá»� int
                if (result < min || result > max) { //náº¿u dá»¯ liá»‡u nháº­p vÃ o nhá»� hÆ¡n min hoáº·c lá»›n hÆ¡n max thÃ¬ hiÃªn thá»‹ lá»—i
                    throw new NumberFormatException(); 

                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in rage [" + min + ", " + max + "]");// hiá»‡n thá»‹ yÃªu cáº§u nháº­p láº¡i
                System.out.print("Enter again: ");
            }
        }
    }
}
