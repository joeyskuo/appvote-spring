package com.kuos.service;

import com.kuos.entities.Vote;
import com.kuos.entities.VoteList;
import com.kuos.repository.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class VoteServiceImpl implements VoteService{

    @Autowired
    private VoteRepository voteRepository;

    @Override
    public VoteList getVotes() {
        VoteList voteList = new VoteList();
        voteList.setVotes(voteRepository.findAll());
        return voteList;
    }

    @Override
    @Transactional
    public Vote createVote(String appName) {
        Vote newVote = new Vote(appName);
        return voteRepository.save(newVote);
    }
}
