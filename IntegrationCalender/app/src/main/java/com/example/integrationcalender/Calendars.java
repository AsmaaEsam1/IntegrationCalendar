package com.example.integrationcalender;

public class Calendars {
    String title;
    String location;
    String endTime;
    String startTime;

    public Calendars(String titles, String locations, String startTimes, String endTimes) {
        title = titles;
        location = locations;
        endTime = endTimes;
        startTime = startTimes;
    }

    public String getTitle() {
        return title;
    }

    public String getLocation() {
        return location;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }


}
