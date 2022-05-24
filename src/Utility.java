import java.util.Arrays;
import java.util.Scanner;

public class Utility {


    public static void printLogo() {
        System.out.println("""
                   __       _                _       _   _    \s
                  / /  __ _| |__  _   _ _ __(_)_ __ | |_| |__ \s
                 / /  / _` | '_ \\| | | | '__| | '_ \\| __| '_ \\\s
                / /__| (_| | |_) | |_| | |  | | | | | |_| | | |
                \\____/\\__,_|_.__/ \\__, |_|  |_|_| |_|\\__|_| |_|
                                  |___/                       \s
                """);
    }

    public static int getN() {
        System.out.println("Enter labyrinth's length:");
        while (true) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            if (n < 3) {
                System.out.println("Incorrect input. Length could not be less than 3.");
                continue;
            }
            return n;
        }
    }

    public static int getM(int n) {
        System.out.println("Enter labyrinth's width:");
        while (true) {
            Scanner in = new Scanner(System.in);
            int m = in.nextInt();

            if (m < 3) {
                System.out.println("Incorrect input. Width could not be less than 3.");
                continue;
            }
            System.out.println("Your Labyrinth's size is " + n + "x" + m);
            return m;
        }
    }

    public static void printField(int n, int m, String[] array) {
        int k = 0;
        System.out.println("   |   ");
        System.out.println("   v   ");
        for (int i = 0; i < m; i++) {
            System.out.print("+-----");
            if ((m - i) == 1) {
                System.out.print("+");
            }
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("| " + array[k] + " ");
                k++;
                if ((m - j) == 1) {
                    System.out.print("|");
                }
            }
            System.out.println();
            for (int j = 0; j < m; j++) {
                System.out.print("+-----");
                if ((m - j) == 1) {
                    System.out.print("+");
                }
            }
            System.out.println();

        }
    }

    public static String[] fillArrayWithWalls(String[] array, int howManyWalls) {
        for (int i = 0; i < howManyWalls; i++) {
            int randIndex = (int) (Math.random() * array.length);
            array[randIndex] = " + ";
        }
        return array;

    }

    public static void fillArrayWithSpaces(String[] array) {
        Arrays.fill(array, "   ");
    }

    public static void startAlgoritm() {
        System.out.println("Type \"start\" to continue.");
        while (true) {
            Scanner in = new Scanner(System.in);
            String n = in.nextLine();
            if (n.equalsIgnoreCase("Start")) {
                return;
            }
        }
    }

    public static void generateStartingPoint(String[] array) {
        int i = 0;
        while(true){
            if(array[i].equals("   ")){
                array[i] = " O ";
                break;
            }else{
                i++;
            }

        }
    }

    public static void generateExitPoint(String[] array) {
        int i = array.length-1;
        while(true){
            if(array[i].equals("   ")){
                array[i] = " O ";
                break;
            }else{
                i--;
            }

        }
    }
}
