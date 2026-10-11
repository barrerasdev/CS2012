// Juan Barreras
// CS 2012 - 06
// 401605188
package hw08;
// Class Time
public class Time implements Comparable<Time>,Calculable<Time>{
    //Data fields
    public int hour;
    public int minute;
    public int second;

    //Constructor for Time object
    public Time(int hour, int minute, int second) {
        // Ensures 0 <= second < 60
        if (second >= 60) {
            minute += second / 60;
            second = second % 60;
        }

        // Ensures 0 <= minute < 60
        if (minute >= 60) {
            hour += minute / 60;
            minute = minute % 60;
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    //Implementing Calculable's add
    @Override
    public Time add(Time other) {
        int newHour = this.hour + other.hour;
        int newMinute = this.minute + other.minute;
        int newSecond = this.second + other.second;
        if(newSecond > 59){
            newMinute = newMinute + (newSecond / 60);
            newSecond = newSecond % 60;
            if(newMinute > 59){
                newHour = newHour + (newMinute / 60);
                newMinute = newMinute % 60;
                return new Time(newHour, newMinute, newSecond);
            }
            return new Time(newHour, newMinute, newSecond);
        }
        if(newMinute > 59){
            newHour = newHour + (newMinute / 60);
            newMinute = newMinute % 60;
            return new Time(newHour, newMinute, newSecond);
        }
        return new Time(newHour, newMinute, newSecond);
    }

    //Implementing Calculable's subtract
    @Override
    public Time subtract(Time other) {
        int newSecond = this.second - other.second;
        int newMinute = this.minute - other.minute;
        int newHour = this.hour - other.hour;

        // Handle seconds borrowing
        if (newSecond < 0) {
            newSecond += 60;
            newMinute--;  // Borrow 1 minute
        }

        // Handle minutes borrowing
        if (newMinute < 0) {
            newMinute += 60;
            newHour--;  // Borrow 1 hour
        }

        // Return normalized result
        return new Time(newHour, newMinute, newSecond);
    }
    // Implementing Comparable''s compareTo
    @Override
    public int compareTo(Time other) {
        if (this.hour > other.hour) {
            return 1;
        }
        if (this.hour < other.hour) {
            return -1;
        }
        if (this.minute > other.minute) {
            return 1;
        }
        if (this.minute < other.minute) {
            return -1;
        }
        if (this.second > other.second) {
            return 1;
        }
        if (this.second < other.second) {
            return -1;
        }
        return 0;
    }

    // toString method
    @Override
    public String toString() {
        return String.format("%d:%02d:%02d", hour, minute, second);
    }
}
