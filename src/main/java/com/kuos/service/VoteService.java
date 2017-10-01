package com.kuos.service;

import com.kuos.entities.Vote;

/**
 * Created by Shi on 9/30/2017.
 */

public interface VoteService {

    public Iterable<Vote> getVotes();

    public Vote createVote(String appName);
}
