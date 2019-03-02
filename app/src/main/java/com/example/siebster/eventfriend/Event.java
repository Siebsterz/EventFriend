package com.example.siebster.eventfriend;

/**
 * Created by Siebe on 2/03/2019.
 */

public class Event {
    private String name;
    private int thumbnail;
    private int event;

    public Event(String eventName) {
        this.name = eventName;
    }

    public void setName(String eventName) {
        this.name = eventName;
    }

    public String getName() {
        return name;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }

}
