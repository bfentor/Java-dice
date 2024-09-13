/**
 * Objective design a random dice simulator that displays as many die as the int passed 
 * in through args NEXT TO EACH OTHER. Some kind of a special display system will have to
 * be created to make this happen.
 * 
 * Refactor to make the die arrays look nicer
 */
import java.util.Random;
import java.util.ArrayList;

public class dice {
    public static void main(String[] args) {
        // Check for null argument and assign number of dice
        int num = 1;
        if (args.length != 0)
            num = Integer.parseInt(args[0]);
            
        // ArrayList of random numbers to be kept track of
        ArrayList<Integer> randList = new ArrayList<>();

        String[] one = new String[5];
        one[0] = "+-------+";
        one[1] = "|       |";
        one[2] = "|   O   |";
        one[3] = "|       |";
        one[4] = "+-------+";

        String[] two = new String[5];
        two[0] = "+-------+";
        two[1] = "| O     |";
        two[2] = "|       |";
        two[3] = "|     O |";
        two[4] = "+-------+";

        String[] three = new String[5];
        three[0] = "+-------+";
        three[1] = "| O     |";
        three[2] = "|   O   |";
        three[3] = "|     O |";
        three[4] = "+-------+";

        String[] four = new String[5];
        four[0] = "+-------+";
        four[1] = "| O   O |";
        four[2] = "|       |";
        four[3] = "| O   O |";
        four[4] = "+-------+";

        String[] five = new String[5];
        five[0] = "+-------+";
        five[1] = "| O   O |";
        five[2] = "|   O   |";
        five[3] = "| O   O |";
        five[4] = "+-------+";
        
        String[] six = new String[5];
        six[0] = "+-------+";
        six[1] = "| O   O |";
        six[2] = "| O   O |";
        six[3] = "| O   O |";
        six[4] = "+-------+";
        
        String[][] dice = {one,two,three,four,five,six};
        
        draw(num, dice, mkList(randList, num));
    }
    public static ArrayList<Integer> mkList(ArrayList<Integer> list, int num) {
        for (int i = 0; i < num; i++) {
            list.add((int)(Math.random()*6));
        }
        return list;
    }
    public static void draw(int num, String[][] dice, ArrayList<Integer> list) {
        for (int i = 0; i < 5; i++) {
            for (int k = 0; k < num; k++) {
                System.out.print(dice[list.get(k)][i] + "  ");
            }
            System.out.println();
        }
    }
}
