package edu.iis.mto.time;

import org.joda.time.DateTime;

import java.sql.Time;
import java.time.Instant;

public class TimeData {

    DateTime time;

    public TimeData() {
        this.time = new DateTime();
    }

    public void setTime(int addSeconds){
        this.time = DateTime.parse(Instant.now().plusSeconds(addSeconds).toString());
    }

    public DateTime getTime() {
        return time;
    }
}

