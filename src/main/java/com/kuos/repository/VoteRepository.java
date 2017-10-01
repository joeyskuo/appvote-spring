package com.kuos.repository;

import com.kuos.entities.Vote;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Shi on 9/30/2017.
 */
@Repository
public interface VoteRepository extends MongoRepository<Vote, String>{

}
