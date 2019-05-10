package com.demo.assessment3.respositories;

import com.demo.assessment3.models.UserEvent;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserEvent, Integer> {
}
