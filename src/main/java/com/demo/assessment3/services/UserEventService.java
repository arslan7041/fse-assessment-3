package com.demo.assessment3.services;

import com.demo.assessment3.models.UserEvent;
import com.demo.assessment3.respositories.UserEventRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserEventService {

    private UserEventRepository userEventRepository;

    @Autowired
    public UserEventService(UserEventRepository userEventRepository){
        this.userEventRepository = userEventRepository;
    }

    public void addEvent(UserEvent userEvent) {
        userEventRepository.save(userEvent);
    }
}
