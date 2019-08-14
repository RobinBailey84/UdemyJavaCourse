import java.util.ArrayList;

public class Divisor {

    public static boolean divisorCalculator(int x){
        int y = 35;

        int remainder = y%x;

        if( remainder > 0 ) {
            return false;
        }
        else {
            return true;
        }

    }

    public static boolean divisorCalculatorOnAnyNumbers(int x, int y){
        int remainder = y%x;
        if (remainder > 0 ){
            return false;
        }
        else {
        return true;
        }
    }

    public static ArrayList<Integer> divisorCalculatorUpToAChosenNumber(int chosenNumber){
        int start = 2;
        ArrayList areDivisors = new ArrayList();
        while (start < chosenNumber ){
            int y = 20;

            int remainder = y%chosenNumber;

            if( remainder == 0 ) {
                areDivisors.add(start);
            }
        }
        return areDivisors;
    }
}
