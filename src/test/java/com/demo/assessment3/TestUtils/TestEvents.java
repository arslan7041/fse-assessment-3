package com.demo.assessment3.TestUtils;

import com.demo.assessment3.models.UserEvent;

import java.util.ArrayList;
import java.util.List;

public class TestEvents {

    public static List<UserEvent> getEvents(){
        List<UserEvent> events = new ArrayList<>();

        events.add(new UserEvent(1, "promotion-viewed", "1b468f7d-79e8-40c1-80a2-0dd7226e7771", 1544401072, "homepage.topnav" ));
        events.add(new UserEvent(2, "video-viewed", "2b468f7d-79e8-40c1-80a2-0dd722688811", 1544401072, "page1" ));
        events.add(new UserEvent(3, "home-button-clicked", "3c468f7d-79e8-40c1-80a2-0dd7226e7771", 1544401072, "page2" ));
        events.add(new UserEvent(4, "opened-popup", "6d568f7d-79e8-40c1-80a2-0dd7226e7771", 1544401072, "page3" ));
        events.add(new UserEvent(5, "checked cart", "4x468f7d-79e8-40c1-80a2-0dd7226e7771", 1544401072, "page4" ));

        return events;
    }
}
