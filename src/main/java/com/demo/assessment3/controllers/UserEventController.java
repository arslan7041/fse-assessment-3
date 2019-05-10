package com.demo.assessment3.controllers;

import com.demo.assessment3.models.UserEvent;
import com.demo.assessment3.services.UserEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserEventController {

    @Autowired
    UserEventService userEventService;

    @PostMapping("UserEvents/getEvent")
    public void addEvent(@RequestBody UserEvent userEvent){
        userEventService.save(userEvent);
    }


    @GetMapping("UserEvents/getEventsById/{userId}")
    public List<UserEvent> findByUserId(@PathVariable String userId){
        return userEventService.findByUserId(userId);
    }

    @GetMapping("UserEvents/getEventsWithinTimeFrame/{first}/{second}")
    public List<UserEvent> findWithinTimeFrame(@PathVariable String first, @PathVariable String second){
        return userEventService.findWithinTimeFrame(first, second);
    }



}
