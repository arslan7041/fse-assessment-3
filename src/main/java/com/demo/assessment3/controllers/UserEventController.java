package com.demo.assessment3.controllers;

import com.demo.assessment3.models.UserEvent;
import com.demo.assessment3.services.UserEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserEventController {

    @Autowired
    UserEventService userEventService;

    @PostMapping("UserEvents/getEvent")
    public void addEvent(@RequestBody UserEvent userEvent){
        userEventService.addEvent(userEvent);
    }




}
