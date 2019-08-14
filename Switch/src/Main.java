public class Main {

    public static void main(String[] args){

        printDayOfTheWeek(0);
        printDayOfTheWeek(7);


        int switchValue = 3;
        switch(switchValue){
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3:case 4:case 5:
                System.out.println("was 3 or 4 or 5");
                break;

            default:
                System.out.println("Was not 1 or 2");
                break;

        }

        char charValue = 'C';
        switch(charValue) {
            case 'A':
                System.out.println("A was found");
                break;

            case 'B':
                System.out.println("B was found");
                break;

            default:
                System.out.println("Could not find your char");
                break;
        }

    }

    public static void printDayOfTheWeek(int day){
        switch(day){
            case 0:
                System.out.println("sunday");
                break;

            case 1:
                System.out.println("monday");
                break;

            case 2:
                System.out.println("tuesday");
                break;

            case 3:
                System.out.println("wednesday");
                break;

            case 4:
                System.out.println("thursday");
                break;

            case 5:
                System.out.println("friday");
                break;

            case 6:
                System.out.println("saturday");
                break;

            default:
                System.out.println("invalid day");



        }

    }

}
