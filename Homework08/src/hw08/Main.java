// Juan Barreras
// CS 2012 - 06
// 401605188
package hw08;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        //Make 10 money objects
        ArrayList<Money> money1 = makeMoney(10);
        //Sort
        Collections.sort(money1);
        //Make 10 more
        ArrayList<Money> money2 = makeMoney(10);
        //Sort
        Collections.sort(money2);
        //Print Money
        System.out.println(showMoney(money1, money2));

        //Make 20 Time objects
        ArrayList<Time> time1 = makeTime(10);
        ArrayList<Time> time2 = makeTime(10);
        //Sort
        Collections.sort(time1);
        Collections.sort(time2);
        //Print Time
        System.out.println(showTime(time1,time2));



    }
    //Makes integer count amount of Time items with Math.random
    public static ArrayList<Time> makeTime(int count){
        ArrayList<Time> times = new ArrayList<>();
        for ( int i = 0; i < count; i++){
            //Sets range
            times.add(new Time((int)((Math.random()*191) +10),(int)(Math.random()*60) , (int)(Math.random()*60)));
        }
        return times;
    }

    // Displays the performance of all methods involving Time
    public static String showTime(ArrayList<Time> time1, ArrayList<Time> time2){
        StringBuilder result = new StringBuilder();
        result.append("\nTime:\nList A       List B      A compared to B         A + B       A - B\n");
        for (int i = 0; i < time1.size(); i++) {
            result.append(String.format("%9s    %9s   %21s   %9s   %s\n",
                    time1.get(i).toString(), time2.get(i).toString(),
                    compareTime(time1.get(i), time2.get(i)),
                    time1.get(i).add(time2.get(i)),
                    time1.get(i).subtract(time2.get(i))));
        }
        return result.toString();

    }
    // Method to print inequality signs for Time
    public static String compareTime(Time time1, Time time2){
        if (time1.compareTo(time2) > 0) {
            // Return A > B
            return time1 + " > " + time2;
        } // If A < B (compareTo returns -1)
        else if (time1.compareTo(time2) < 0) {
            // Return A < B
            return time1 + " < " + time2;
        } // Else A = B (compareTo returns 0)
        else {
            return time1 + " = " + time2;
        }
    }

    //Method to create Money objects based on int count with a Math.random range
    public static ArrayList<Money> makeMoney ( int conut ) {
        ArrayList<Money> money = new ArrayList<>();
        for ( int i = 0; i < conut; i++){
            money.add(new Money((int)(Math.random()*490 + 10),(int)(Math.random()*100)));
        }
        return money;
    }

    //Method to return inequality signs for Money
    public static String compareMoney(Money money1, Money money2) {
            // If A is greater than B (compareTo returns 1)
            if (money1.compareTo(money2) > 0) {
                // Return A > B
               return money1 + " > " + money2;
            } // If A < B (compareTo returns -1)
            else if (money1.compareTo(money2) < 0) {
                // Return A < B
                return money1 + " < " + money2;
            } // Else A = B (compareTo returns 0)
            else {
                return money1 + " = " + money2;
            }
    }
    //Method to demonstrate methods for Money objects
    public static String showMoney(ArrayList<Money> money1, ArrayList<Money> money2) {
        StringBuilder result = new StringBuilder();
        result.append("\nMoney:\nList A    List B    A compared to B     A + B     A - B\n");
        for (int i = 0; i < money1.size(); i++) {
            result.append(String.format("%7s   %7s   %17s   %7s   %7s\n", money1.get(i).toString(), money2.get(i).toString(), compareMoney(money1.get(i), money2.get(i)), money1.get(i).add(money2.get(i)), money1.get(i).subtract(money2.get(i))));
        }
        return result.toString();
    }

}


