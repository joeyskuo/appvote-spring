package com.kuos.controller;

import com.kuos.entities.Vote;
import com.kuos.service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Shi on 9/30/2017.
 */
@RestController
public class VoteRestController {

    @Autowired
    private VoteService voteService;

    @PostMapping(path = "/vote", consumes = "application/json")
    public Vote sendVote(@RequestBody Vote vote) {
        return voteService.createVote(vote.getAppName());
        //return appName.appName;
    }


    @GetMapping(path = "/votes")
    public Iterable<Vote> votes() {
        return voteService.getVotes();
    }
}
