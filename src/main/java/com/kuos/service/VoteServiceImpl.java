package com.kuos.service;

import com.kuos.entities.Vote;
import com.kuos.repository.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Shi on 9/30/2017.
 */
@Service
public class VoteServiceImpl implements VoteService{

    @Autowired
    private VoteRepository voteRepository;

    @Override
    public Iterable<Vote> getVotes() {
        return voteRepository.findAll();
    }

    @Override
    @Transactional
    public Vote createVote(String appName) {
        Vote newVote = new Vote(appName);
        return voteRepository.save(newVote);
    }
}
