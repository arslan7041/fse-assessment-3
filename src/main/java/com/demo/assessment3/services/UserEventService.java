package com.demo.assessment3.services;

import com.demo.assessment3.models.UserEvent;
import com.demo.assessment3.respositories.UserEventRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class UserEventService {

    private UserEventRepository userEventRepository;

    @Autowired
    public UserEventService(UserEventRepository userEventRepository){
        this.userEventRepository = userEventRepository;
    }

    public void save(UserEvent userEvent) {
        userEventRepository.save(userEvent);
    }

    public List<UserEvent> findByUserId(String userId) {
        return userEventRepository.findByUserId(userId);
    }

    public List<UserEvent> findWithinTimeFrame(long first, long second) {
        return userEventRepository.findWithinTimeFrame(first, second);
    }
}
