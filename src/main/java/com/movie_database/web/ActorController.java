package com.movie_database.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.movie_database.business.Actor;
import com.movie_database.db.ActorRepo;


import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/actors") // has to be lower case and if multiple words spinal case. Should be same name
								// as
								// entity
public class ActorController {
	@Autowired
	private ActorRepo actorRepo;

//list all actors
	@GetMapping("/")
	public List<Actor> getAllActors() {
		return actorRepo.findAll();

	}

	// get actor by id
		@GetMapping("/{id}")
		public Optional getActor(@PathVariable int id) {
			Optional<Actor> a = actorRepo.findById(id);
			return a;

	}

// add an actor
	@PostMapping("/")
	public Actor addActor(@RequestBody Actor a) {
		return actorRepo.save(a);
	}

//update an actor
	@PutMapping("/")
	public Actor updateActor(@RequestBody Actor a) {
		return actorRepo.save(a);
	}

	// delete an actor
	@DeleteMapping("/")
	public void deleteActor(@RequestBody Actor a) {
		actorRepo.delete(a);
	}

}
