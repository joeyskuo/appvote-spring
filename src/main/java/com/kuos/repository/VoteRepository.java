package com.kuos.repository;

import com.kuos.entities.Vote;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Shi on 9/30/2017.
 */
public interface VoteRepository extends MongoRepository<Vote, String>{
}
