package com.kuos.repository;

import com.kuos.entities.Vote;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VoteRepository extends MongoRepository<Vote, String>{

}
