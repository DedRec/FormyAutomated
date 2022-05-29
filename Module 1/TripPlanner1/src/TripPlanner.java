/* This Program should help you plan your trip by asking a few questions
 */
import java.util.Scanner;

public class TripPlanner {
    public static void main(String[] args){
        Greeting();
        System.out.println("*****************");
        System.out.println("");
        travelTimeBudget();
        System.out.println("*****************");
        System.out.println("");
        TimeDifference();
        System.out.println("*****************");
        System.out.println("");
        CountryArea();
        System.out.println("*****************");
        System.out.println("");
    }

    private static void CountryArea() {
        Scanner input= new Scanner(System.in);
        System.out.print("what's the area of your travel destination country in km^2? ");
        int areaKm= input.nextInt();
        double areaMile= (int) (areaKm/1.609*100)/100.0;
        System.out.println("In miles^2 that is "+areaMile);
    }

    private static void TimeDifference() {
        Scanner input=new Scanner(System.in);
        System.out.print("What is the time difference, in hours, between your home and your destination?(If the destination time zone is “behind” the your home time zone you should enter a negative number) ");
        int time= input.nextInt();
        int midnight= (time+24) % 24;
        int noon= (time + 36) % 24;
        System.out.println("That means that when it's midnight at home it will be "+midnight+":00 in your travel destination, and it will be "+noon+":00 when it is noon at your home");
    }

    public static void travelTimeBudget() {
        Scanner input= new Scanner(System.in);
        System.out.print("How many days are you going to spend in your destination? ");
        int days= input.nextInt();
        System.out.print("What is your budget for the trip in USD? ");
        double budget= input.nextDouble();
        System.out.print("What is the letter currency symbol for your destination? For example, the us dollar’s is USD, the euro’s is EU ");
        String currency= input.next();
        System.out.print("How many "+currency+" are in 1 USD? ");
        double conversion= input.nextDouble();
        int hours= days*24;
        int min= hours*60;
        int sec= min*60;
        System.out.println("If you're travelling for "+days+", that is equivalent to "+hours+" hours, "+min+" minutes, or "+sec+" seconds.");
        double budgetdaily= (int) (budget/days*100)/100.0;
        System.out.println("If you're going to spend "+budget+" USD, then that means you can spend up to "+budgetdaily+" USD daily");
        double budgetcurrency=(int) (budget*conversion*100)/100.0;
        double budgetcurrencydaily=(int) (budgetcurrency/days*100)/100.0;
        System.out.println("Your total budget in "+currency+" is "+budgetcurrency+" "+currency+", which is "+budgetcurrencydaily+" "+currency+" daily.");
    }

    public static void Greeting() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Trip Planner!");
        System.out.print("What's your name? ");
        String name= input.nextLine();
        System.out.print("Nice to meet you "+ name + ", where are you travelling to? ");
        String city= input.next();
        System.out.println("Sounds great! "+city+" is a great place with plenty of tourist sites to visit!");
    }
}
