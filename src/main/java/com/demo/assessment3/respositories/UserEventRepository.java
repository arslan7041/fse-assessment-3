package com.demo.assessment3.respositories;

import com.demo.assessment3.models.UserEvent;
import feign.Param;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface UserEventRepository extends MongoRepository<UserEvent, Integer> {

    List<UserEvent> findByUserId(String userId);

    @Query(value = "select * from UserEvent u where u.timestamp > ?1 and u.timestamp < ?2", nativeQuery = true)
    List<UserEvent> findWithinTimeFrame(@Param("timestamp1") String timestanp1, @Param("timestamp2") String timestamp2);
}
