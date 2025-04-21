package org.example;

//Calculate the number of clicks between the start and end time below
//Start time: 4:20 PM
//End time: 5:15 PM

public class Main {
    public static void main(String[] args) {
        int startHour = 4, startMinute = 20;
        int endHour = 5, endMinute = 15;

        // Convert both times to total minutes since 12:00
        int startTotal = startHour * 60 + startMinute;
        int endTotal = endHour * 60 + endMinute;

        // Calculate the difference in minutes
        int diff = Math.abs(endTotal - startTotal);

        // The clock is circular (12 hours = 720 minutes)
        int shortestClicks = Math.min(diff, 720 - diff);

        System.out.println("Shortest number of clicks: " + shortestClicks);
    }
}


