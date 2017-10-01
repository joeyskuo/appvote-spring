package com.kuos.service;

import com.kuos.entities.Vote;
import com.kuos.entities.VoteList;

/**
 * Created by Shi on 9/30/2017.
 */

public interface VoteService {

    public VoteList getVotes();

    public Vote createVote(String appName);
}
