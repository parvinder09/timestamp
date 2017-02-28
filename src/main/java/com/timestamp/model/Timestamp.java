package com.timestamp.model;

/**
 * Created by parvinder.kumar on 2/28/2017.
 */
public class Timestamp {
    private Long unixdate;
    private String naturalTimestamp;

    public Timestamp(){
        this.unixdate = null;
        this.naturalTimestamp=null;
    }

    public Timestamp(long unixdate, String naturalTimestamp) {
        this.unixdate = unixdate;
        this.naturalTimestamp = naturalTimestamp;
    }

    public long getUnixdate() {
        return unixdate;
    }

    public void setUnixdate(long unixdate) {
        this.unixdate = unixdate;
    }

    public String getNaturalTimestamp() {
        return naturalTimestamp;
    }

    public void setNaturalTimestamp(String naturalTimestamp) {
        this.naturalTimestamp = naturalTimestamp;
    }
}
