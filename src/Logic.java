public class Logic {
    public static void start() {
        Utility.printLogo();
        int n = Utility.getN();
        int m = Utility.getM(n);


        String[] array = new String[n*m];
        double k = 0.25;
        int howManyWalls = (int)(n*m*k);


        Utility.fillArrayWithSpaces(array);
        Utility.fillArrayWithWalls(array,howManyWalls);
        Utility.printField(n,m,array);
        Utility.startAlgoritm();
        Utility.generateStartingPoint(array);
        Utility.generateExitPoint(array);
        Utility.printField(n,m,array);

    }
}
