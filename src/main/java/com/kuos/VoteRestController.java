package com.kuos;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Shi on 9/30/2017.
 */
@RestController
public class VoteRestController {

    @RequestMapping(path = "/vote", method = RequestMethod.POST)
    public String vote() {
        return "vote post response";
    }


    @RequestMapping(path = "/votes", method = RequestMethod.GET)
    public String votes() {
        return "vote list response";
    }

}
