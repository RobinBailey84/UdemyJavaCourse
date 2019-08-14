public class Main {

    public static void main(String[] args) {

        long miles = SpeedConverter.toMilesPerHour(10.5);
        System.out.println("Miles = " + miles);

        SpeedConverter.printConversion(10.5);

        SpeedConverter.printMegaBytesAndKiloBytes(5000);

        boolean wakeUp = SpeedConverter.shouldWakeUp(true, -1);
        System.out.println(wakeUp);
    }
}
