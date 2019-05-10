package com.demo.assessment3.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    private String type;
    private String userId;
    private long timestamp;
    private String context;

    public UserEvent(Integer id, String type, String userId, long timestamp, String context) {
        this.id = id;
        this.type = type;
        this.userId = userId;
        this.timestamp = timestamp;
        this.context = context;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
