package com.kuos.service;

import com.kuos.entities.Vote;
import com.kuos.entities.VoteList;


public interface VoteService {

    public VoteList getVotes();

    public Vote createVote(String appName);
}
