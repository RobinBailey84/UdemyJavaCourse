public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour){

        if(kilometersPerHour < 0){
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour < 0){
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + "km/h = " + milesPerHour + " mi/h");
    }
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        } else{
            int mb = kiloBytes / 1024;
            int remainingKb = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB " + " = " + mb + " MB and " + remainingKb + " KB");

        }
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(hourOfDay < 0){
            return false;
        }else if(hourOfDay > 23){
            return false;
        } else if (barking == true && hourOfDay < 8){
            return true;
        } else if (barking == true && hourOfDay > 22){
            return true;
        }
        return false;
    }

    public static boolean isLeapYear(int year){

                int a = year % 4;
                int b = year % 100;
                int c = year % 400;

                if (year < 1 || year > 9999) {
                    return false;
                }
                else if (a==0 && b!=0){
                    return true;
                }
                else if (a == 0 && b == 0 && c != 0) {
                    return false;
                }
                else if (a == 0 && b == 0 && c == 0) {
                    return true;
                }
                return false;
            }
    }
}
