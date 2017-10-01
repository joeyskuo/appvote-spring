package com.kuos;

import com.kuos.entities.Vote;
import com.kuos.repository.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppvoteApplication implements CommandLineRunner{

	@Autowired
	private VoteRepository repository;

	public static void main(String[] args) {

		SpringApplication.run(AppvoteApplication.class, args);
	}


	@Override
	public void run(String... strings) throws Exception {

		repository.deleteAll();

		// save a couple of votes
		repository.save(new Vote("Twitter"));
		repository.save(new Vote("Yelp"));

		// fetch all votes
		System.out.println("Vote found with findAll():");
		System.out.println("-------------------------------");
		for (Vote vote : repository.findAll()) {
			System.out.println(vote);
		}

		System.out.println("Finished!");

	}
}
